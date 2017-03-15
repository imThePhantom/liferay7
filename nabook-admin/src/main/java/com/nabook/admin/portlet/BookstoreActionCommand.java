package com.nabook.admin.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.nabook.model.Bookstore;
import com.nabook.service.BookstoreLocalServiceUtil;
import com.nabook.util.NabookConstants;

@Component(immediate = true, property = { "javax.portlet.name=" + NabookConstants.PORTLET_NABOOKADMIN,
		"mvc.command.name=" + NabookConstants.ACTION_BOOKSTORE, }, service = MVCActionCommand.class)

public class BookstoreActionCommand extends BaseMVCActionCommand {

	protected void addBookstore(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Bookstore.class.getName(), request);
		String name = ParamUtil.getString(request, "name");
		String country = ParamUtil.getString(request, "country");
		String city = ParamUtil.getString(request, "city");
		String prefecture = ParamUtil.getString(request, "prefecture");
		String street = ParamUtil.getString(request, "street");
		String zip = ParamUtil.getString(request, "zip");
		String phone = ParamUtil.getString(request, "phone");
		String description = ParamUtil.getString(request, "description");

		try {
			BookstoreLocalServiceUtil.addBookstore(serviceContext, serviceContext.getUserId(), name, country, city,
					prefecture, street, zip, phone, description);
			SessionMessages.add(request, "success", "message.success.add.bookstore");
			response.setRenderParameter("mvcPath", "/bookstore/view.jsp");
		} catch (Exception e) {
			logger.error("CREATE store " + name + " failed", e);
			SessionErrors.add(request, "error", e.getMessage());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/bookstore/add.jsp");
		}
	}

	protected void deleteBookstore(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		System.out.println("Method deleteBookstore invoked");
		long bookstoreId = ParamUtil.getLong(request, "Id");

		try {
			BookstoreLocalServiceUtil.deleteBookstore(bookstoreId);
			SessionMessages.add(request, "message.success.delete.bookstore");
		} catch (Exception e) {
			SessionErrors.add(request, "error", e.getMessage());
			logger.error("DELETE store with id " + bookstoreId + " failed", e);
		}
	}

	protected void updateBookstore(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Bookstore.class.getName(), request);

		long bookstoreId = ParamUtil.getLong(request, "bookstoreId");
		String name = ParamUtil.getString(request, "name");
		String country = ParamUtil.getString(request, "country");
		String city = ParamUtil.getString(request, "city");
		String prefecture = ParamUtil.getString(request, "prefecture");
		String street = ParamUtil.getString(request, "street");
		String zip = ParamUtil.getString(request, "zip");
		String phone = ParamUtil.getString(request, "phone");
		String description = ParamUtil.getString(request, "description");

		if (bookstoreId > 0) {
			try {
				BookstoreLocalServiceUtil.updateBookstore(serviceContext, serviceContext.getUserId(), bookstoreId, name,
						country, city, prefecture, street, zip, phone, description);
				SessionMessages.add(request, "success", "message.success.update.bookstore");
				response.setRenderParameter("mvcPath", "/bookstore/view.jsp");
			} catch (Exception e) {
				System.out.println("Exception throwed");
				SessionMessages.add(request, "error", e.getMessage());
				PortalUtil.copyRequestParameters(request, response);
				response.setRenderParameter("mvcPath", "/bookstore/update.jsp");
			}
		} else {
			SessionMessages.add(request, "error", "paramester missing");
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/bookstore/update.jsp");
		}
	}

	public Log logger = LogFactoryUtil.getLog(Bookstore.class.getName());

	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response) throws Exception {
		String cmd = ParamUtil.getString(request, NabookConstants.CMD);
		try {
			if (cmd.equals(NabookConstants.ADD)) {
				addBookstore(request, response);
			} else if (cmd.equals(NabookConstants.UPDATE)) {
				updateBookstore(request, response);
			} else if (cmd.equals(NabookConstants.DELETE)) {
				deleteBookstore(request, response);
			} else {
				System.out.println("Command not found");
			}
		} catch (Exception e) {

		}
	}

}
