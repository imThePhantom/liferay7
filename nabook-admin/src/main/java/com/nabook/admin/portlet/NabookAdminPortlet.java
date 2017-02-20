package com.nabook.admin.portlet;

import com.nabook.admin.constants.NabookAdminConstants;
import com.nabook.admin.constants.WebKeys;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import java.io.IOException;
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
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/bookstore/view.jsp",
		"javax.portlet.name=" + NabookAdminConstants.PORTLET_NABOOKADMIN, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator,power-user",
		"javax.portlet.supports.mime-type=text/html" }, service = Portlet.class)
public class NabookAdminPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		User user = (User) request.getAttribute(WebKeys.USER);
		String mvcPath = request.getParameter("mvcPath");
		if (mvcPath == null) {
			mvcPath = "null";
		}
		System.out.println("Render:");
		System.out.println("\t-portlet: " + NabookAdminConstants.PORTLET_NABOOKADMIN);
		System.out.println("\t-mvcPath: " + mvcPath);
		System.out.println("\t-backURL: " + request.getParameter("backURL"));
		System.out.println("\t-User: " + user.getScreenName());
		System.out.print("\t-Role: ");
		for (Role role : user.getRoles()) {
			System.out.print(role.getName() + ", ");
		}
		System.out.println();
		if (mvcPath.contains("update") || mvcPath.contains("detail")) {
			System.out.println("\t-Parameter: " + request.getParameter("Id"));
		}

		super.render(request, response);
	}
}