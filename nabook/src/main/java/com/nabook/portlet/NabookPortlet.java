package com.nabook.portlet;

import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.WebKeys;
import com.nabook.constants.NabookConstants;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true, 
	property = { "com.liferay.portlet.display-category=NABook",
			"com.liferay.portlet.instanceable=false", 
			"javax.portlet.name=" + NabookConstants.PORTLET_NABOOK,
			"javax.portlet.display-name=" + NabookConstants.PORTLET_NABOOK, 
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/home.jsp", 
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=administrator,power-user,user,guest" }, 
	service = Portlet.class)
public class NabookPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		System.out.println("Render:");
		System.out.println("\t-portlet: " + NabookConstants.PORTLET_NABOOK);
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