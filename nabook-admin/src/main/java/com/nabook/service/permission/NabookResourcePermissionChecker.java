package com.nabook.service.permission;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseResourcePermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.ResourcePermissionChecker;

@Component(
	immediate = true,
	property = {
			"resource.name=" + NabookResourcePermissionChecker.RESOURCE_NAME
	},
	service = ResourcePermissionChecker.class
)
public class NabookResourcePermissionChecker extends BaseResourcePermissionChecker {
	public static final String RESOURCE_NAME = "com.nabook";
	
	public static void check(PermissionChecker permissionChecker, long groupId, String actionId)
			throws PortalException {
		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, RESOURCE_NAME, groupId, actionId);
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long groupId,
			String actionId) {
		return contains(permissionChecker, RESOURCE_NAME, groupId, actionId);
	}

	@Override
	public Boolean checkResource(PermissionChecker permissionChecker, long classPK, String actionId) {
		return contains(permissionChecker, classPK, actionId);
	}

}
