package com.nabook.admin.application.list;

import com.nabook.admin.constants.NabookAdminConstants;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true, 
	property = { "panel.app.order:Integer=100",
				 "panel.category.key=" + NabookAdminConstants.CONTROL_PANEL_CATEGORY },
	service = PanelApp.class
)
public class NabookAdminPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return NabookAdminConstants.PORTLET_NABOOKADMIN;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + NabookAdminConstants.PORTLET_NABOOKADMIN + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}