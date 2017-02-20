package com.nabook.service.permission;

import org.osgi.service.component.annotations.Component;

import com.liferay.exportimport.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.nabook.admin.constants.NabookAdminConstants;
import com.nabook.model.Bookstore;
import com.nabook.service.BookstoreLocalServiceUtil;

@Component(immediate = true, property = { "model.class.name=com.nabook.model.Bookstore" })
public class BookstorePermissionChecker implements BaseModelPermissionChecker {

	public static void check(PermissionChecker permissionChecker, Bookstore bookstore, String portletId,
			String actionId) throws PortalException {
		if (!contains(permissionChecker, bookstore, portletId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, Bookstore.class.getName(),
					bookstore.getBookstoreId(), actionId);
		}
	}

	public static void check(PermissionChecker permissionChecker, long bookstoreId, String portletId, String actionId)
			throws PortalException {
		if (!contains(permissionChecker, bookstoreId, portletId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, Bookstore.class.getName(), bookstoreId,
					actionId);
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, Bookstore bookstore, String portletId,
			String actionId) throws PortalException {
		Boolean hasPermission = StagingPermissionUtil.hasPermission(permissionChecker, bookstore.getGroupId(),
				Bookstore.class.getName(), bookstore.getBookstoreId(), portletId, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		if (permissionChecker.hasOwnerPermission(bookstore.getGroupId(), Bookstore.class.getName(),
				bookstore.getBookstoreId(), bookstore.getUserId(), actionId)) {
			return true;
		}

		return permissionChecker.hasPermission(bookstore.getGroupId(), Bookstore.class.getName(),
				bookstore.getBookstoreId(), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long bookstoreId, String portletId,
			String actionId) throws PortalException {
		Bookstore bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);

		return contains(permissionChecker, bookstore, portletId, actionId);
	}

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId)
			throws PortalException {
		check(permissionChecker, primaryKey, NabookAdminConstants.PORTLET_NABOOKADMIN, actionId);
	}
}
