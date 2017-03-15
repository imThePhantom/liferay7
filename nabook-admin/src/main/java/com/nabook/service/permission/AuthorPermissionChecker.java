package com.nabook.service.permission;

import org.osgi.service.component.annotations.Component;

import com.liferay.exportimport.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.nabook.model.Author;
import com.nabook.service.AuthorLocalServiceUtil;
import com.nabook.util.NabookConstants;


@Component(
	immediate = true,
	property = {
		"model.class.name=com.nabook.model.Author"
	})
public class AuthorPermissionChecker implements BaseModelPermissionChecker{

	public static void check(PermissionChecker permissionChecker, Author author, String portletId,
			String actionId) throws PortalException {
		if (!contains(permissionChecker, author, portletId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, Author.class.getName(),
					author.getAuthorId(), actionId);
		}
	}

	public static void check(PermissionChecker permissionChecker, long authorId, String portletId, String actionId)
			throws PortalException {
		if (!contains(permissionChecker, authorId, portletId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, Author.class.getName(), authorId,
					actionId);
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, Author author, String portletId,
			String actionId) throws PortalException {
		Boolean hasPermission = StagingPermissionUtil.hasPermission(permissionChecker, author.getGroupId(),
				Author.class.getName(), author.getAuthorId(), portletId, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		if (permissionChecker.hasOwnerPermission(author.getGroupId(), Author.class.getName(),
				author.getAuthorId(), author.getUserId(), actionId)) {
			return true;
		}

		return permissionChecker.hasPermission(author.getGroupId(), Author.class.getName(),
				author.getAuthorId(), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long authorId, String portletId,
			String actionId) throws PortalException {
		Author author = AuthorLocalServiceUtil.getAuthor(authorId);

		return contains(permissionChecker, author, portletId, actionId);
	}

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId)
			throws PortalException {
		check(permissionChecker, primaryKey, NabookConstants.PORTLET_NABOOKADMIN, actionId);
	}

}
