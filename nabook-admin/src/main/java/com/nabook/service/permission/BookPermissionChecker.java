package com.nabook.service.permission;

import org.osgi.service.component.annotations.Component;

import com.liferay.exportimport.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.nabook.model.Book;
import com.nabook.service.BookLocalServiceUtil;
import com.nabook.util.NabookConstants;

@Component(
	immediate = true,
	property = { 
		"model.class.name=com.nabook.model.Book"
	})
public class BookPermissionChecker implements BaseModelPermissionChecker {

	public static void check(PermissionChecker permissionChecker, Book book, String portletId,
			String actionId) throws PortalException {
		if (!contains(permissionChecker, book, portletId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, Book.class.getName(),
					book.getBookId(), actionId);
		}
	}

	public static void check(PermissionChecker permissionChecker, long bookId, String portletId, String actionId)
			throws PortalException {
		if (!contains(permissionChecker, bookId, portletId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, Book.class.getName(), bookId,
					actionId);
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, Book book, String portletId,
			String actionId) throws PortalException {
		Boolean hasPermission = StagingPermissionUtil.hasPermission(permissionChecker, book.getGroupId(),
				Book.class.getName(), book.getBookId(), portletId, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		if (permissionChecker.hasOwnerPermission(book.getGroupId(), Book.class.getName(),
				book.getBookId(), book.getUserId(), actionId)) {
			return true;
		}

		return permissionChecker.hasPermission(book.getGroupId(), Book.class.getName(),
				book.getBookId(), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long bookId, String portletId,
			String actionId) throws PortalException {
		Book book = BookLocalServiceUtil.getBook(bookId);

		return contains(permissionChecker, book, portletId, actionId);
	}

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId)
			throws PortalException {
		check(permissionChecker, primaryKey, NabookConstants.PORTLET_NABOOKADMIN, actionId);
	}
}
