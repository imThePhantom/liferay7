package com.nabook.service.friendlyurl;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.nabook.admin.constants.NabookAdminConstants;

@Component(
	property = {
		"com.liferay.portlet.friendly-url-routes=META-INF/configs/routes.xml",
		"javax.portlet.name=" + NabookAdminConstants.PORTLET_NABOOKADMIN,
	},
	service = FriendlyURLMapper.class
)
public class NabookAdminFriendlyURLMapper extends DefaultFriendlyURLMapper {
	
	@Override
	public String getMapping() {
		return _MAPPING;
	}

	private static final String _MAPPING = NabookAdminConstants.NABOOK_MAPPING;
}
