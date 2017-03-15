package com.nabook.admin.portlet;

import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.nabook.util.NabookConstants;
import com.nabook.util.WebKeys;

import java.io.IOException;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, 
	property = { "com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.layout-cacheable=true",
		"com.liferay.portlet.header-portlet-css=/css/style.css",
		"com.liferay.portlet.private-request-attributes=false",
		"com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50",
		"com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=NABook Management", 
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/bookstore/view.jsp",
		"javax.portlet.name=" + NabookConstants.PORTLET_NABOOKADMIN, 
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator,power-user",
		"javax.portlet.supports.mime-type=text/html" }, 
	service = Portlet.class)

public class NabookAdminPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		System.out.println("Render:");
		System.out.println("\t-portlet: " + NabookConstants.PORTLET_NABOOKADMIN);
		User user = (User) request.getAttribute(WebKeys.USER);
		if (user != null) {
			System.out.println("\t-User: " + user.getScreenName());
			System.out.print("\t-Role: ");
			for (Role role : user.getRoles()) {
				System.out.print(role.getName() + ", ");
			}
		} else {
			System.out.println("\t-User: Guest");
		}
		System.out.println("\n\t===Parameter===");

		for (String param : request.getParameterMap().keySet()) {
			System.out.println("\t-" + param + ":" + request.getParameter(param));
		}

		super.render(request, response);
	}
}