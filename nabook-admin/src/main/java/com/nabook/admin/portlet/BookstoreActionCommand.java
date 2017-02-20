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
import com.nabook.admin.constants.NabookAdminConstants;
import com.nabook.model.Bookstore;
import com.nabook.service.BookstoreLocalServiceUtil;

@Component(
	immediate = true,
	property = {
			"javax.portlet.name=" + NabookAdminConstants.PORTLET_NABOOKADMIN
	},
	service = MVCActionCommand.class
)

public class BookstoreActionCommand extends BaseMVCActionCommand {

	public void addBookstore(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
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
			System.out.println("Add bookstore success");
			SessionMessages.add(request, "success", "message.success.add.bookstore");
		} catch (Exception e) {
			logger.error("CREATE store " + name + " failed", e);
			SessionErrors.add(request, "error", e.getMessage());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/bookstore/update.jsp");
		}
	}

	public void deleteBookstore(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		System.out.println("Method deleteBookstore invoked");
		long bookstoreId = ParamUtil.getLong(request, "Id");

		try {
			BookstoreLocalServiceUtil.deleteBookstore(bookstoreId);
			SessionMessages.add(request, "message.success.delete.bookstore");
			System.out.println("Delete bookstore success");
		} catch (Exception e) {
			SessionErrors.add(request, e.getClass(), e);
			logger.error("DELETE store with id " + bookstoreId + " failed", e);
		}
	}

	public void updateBookstore(ActionRequest request, ActionResponse response)
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
				System.out.println("Update bookstore success");
				SessionMessages.add(request, "success", "message.success.update.bookstore");
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
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
