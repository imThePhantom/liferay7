package com.nabook.admin.portlet;

import com.nabook.admin.constants.NabookAdminPortletKeys;
import com.nabook.model.Bookstore;
import com.nabook.service.BookstoreLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.display-category=category.hidden", "com.liferay.portlet.layout-cacheable=true",
		"com.liferay.portlet.private-request-attributes=false", "com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50", "com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=NABook Management", "javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + NabookAdminPortletKeys.NabookAdmin, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator,power-user,user",
		"javax.portlet.supports.mime-type=text/html" }, service = Portlet.class)
public class NabookAdminPortlet extends MVCPortlet {

	public void addBookstore(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Bookstore.class.getName(), request);
		String name = ParamUtil.getString(request, "name");
		String country = ParamUtil.getString(request, "country");
		String city = ParamUtil.getString(request, "city");
		String prefecture = ParamUtil.getString(request, "prefecture");
		String street = ParamUtil.getString(request, "street");
		String zip = ParamUtil.getString(request, "zip");
		String phone = ParamUtil.getString(request, "phone");
		try {
			BookstoreLocalServiceUtil.addBookstore(serviceContext, serviceContext.getUserId(), name, country, city,
					prefecture, street, zip, phone);
			System.out.println("Add bookstore success");
			SessionMessages.add(request, "success", "message.success.add.bookstore");
		} catch (Exception e) {
			System.out.println("Exception throwed");
			SessionErrors.add(request, "error", e.getMessage());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/bookstore/edit_store.jsp");
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
		if (bookstoreId > 0) {
			try {
				BookstoreLocalServiceUtil.addBookstore(serviceContext, serviceContext.getUserId(), name, country, city,
						prefecture, street, zip, phone);
				System.out.println("Add bookstore success");
				SessionMessages.add(request, "success", "message.success.update.bookstore");
			} catch (Exception e) {
				System.out.println("Exception throwed");
				SessionMessages.add(request, "error", e.getMessage());
				PortalUtil.copyRequestParameters(request, response);
				response.setRenderParameter("mvcPath", "/bookstore/edit_store.jsp");
			}
		} else {
			SessionMessages.add(request, "error", "paramester missing");
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/bookstore/edit_store.jsp");
		}
	}
	
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws IOException, PortletException {
		SessionMessages.add(request, "success", "abc");
		System.out.println("Render method invoked");
		super.render(request, response);
	}
}