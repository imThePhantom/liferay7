package com.nabook.admin.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.nabook.model.Author;
import com.nabook.service.AuthorLocalServiceUtil;
import com.nabook.util.NabookConstants;

@Component(
	immediate = true, 
	property = { 
		"javax.portlet.name=" + NabookConstants.PORTLET_NABOOKADMIN,
		"mvc.command.name=" + NabookConstants.ACTION_AUTHOR, 
	}, 
	service = MVCActionCommand.class)
public class AuthorActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response) throws Exception {
		String cmd = ParamUtil.getString(request, NabookConstants.CMD);
		try {
			if (cmd.equals(NabookConstants.ADD)) {
				addAuthor(request, response);
			} else if (cmd.equals(NabookConstants.UPDATE)) {
				updateAuthor(request, response);
			} else if (cmd.equals(NabookConstants.DELETE)) {
				deleteAuthor(request, response);
			} else {
				System.out.println("Command not found");
			}
		} catch (Exception e) {
			System.out.println("process Action has exception");
		}
	}

	protected void addAuthor(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
		System.out.println("add Author");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Author.class.getName(), request);
		String fullName = ParamUtil.getString(request, "fullName");
		String profile = ParamUtil.getString(request, "profile");

		try {
			AuthorLocalServiceUtil.addAuthor(serviceContext, serviceContext.getUserId(), fullName, profile);
			SessionMessages.add(request, "success");
			response.setRenderParameter("mvcPath", "/author/view.jsp");
		} catch (Exception e) {
			SessionErrors.add(request, "error", e.getMessage());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/author/add.jsp");
		}
	}

	protected void deleteAuthor(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		System.out.println("delete author");
		long authorId = ParamUtil.getLong(request, "Id");
		
		try {
			AuthorLocalServiceUtil.deleteAuthor(authorId);
			SessionMessages.add(request, "success");
			response.setRenderParameter("mvcPath", "/author/view.jsp");
		} catch (Exception e) {
			SessionErrors.add(request, "error", e.getMessage());
		}
	}
	
	protected void updateAuthor(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Author.class.getName(), request);
		long authorId = ParamUtil.getLong(request, "authorId");
		String fullName = ParamUtil.getString(request, "fullName");
		String profile = ParamUtil.getString(request, "profile");
			
		try {
			AuthorLocalServiceUtil.updateAuthor(serviceContext, serviceContext.getUserId(), authorId, fullName, profile);
			SessionMessages.add(request, "success");
			response.setRenderParameter("mvcPath", "/author/view.jsp");
		} catch (Exception e) {
			SessionErrors.add(request, "error", e.getMessage());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/author/update.jsp");
		}
	}
}
