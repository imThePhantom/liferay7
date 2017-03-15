package com.nabook.service.friendlyurl;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.nabook.util.NabookConstants;

@Component(
	property = {
		"com.liferay.portlet.friendly-url-routes=META-INF/configs/routes.xml",
		"javax.portlet.name=" + NabookConstants.PORTLET_NABOOKADMIN,
	},
	service = FriendlyURLMapper.class
)
public class NabookAdminFriendlyURLMapper extends DefaultFriendlyURLMapper {
	
	@Override
	public String getMapping() {
		return _MAPPING;
	}

	private static final String _MAPPING = NabookConstants.NABOOK_MAPPING;
}
