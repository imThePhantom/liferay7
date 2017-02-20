<%@ include file="../init.jsp"%>

<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Bookstore bookstore = (Bookstore) row.getObject();
%>

<liferay-ui:icon-menu message="none">
	<c:if
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
							NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.PERMISSIONS)%>">
		<liferay-security:permissionsURL
			modelResource="<%=Bookstore.class.getName()%>"
			modelResourceDescription="<%=bookstore.getName()%>"
			resourcePrimKey="<%=String.valueOf(bookstore.getBookstoreId())%>"
			var="permissionURL">
		</liferay-security:permissionsURL>

		<liferay-ui:icon image="permissions" url="<%=permissionURL.toString()%>"></liferay-ui:icon>
	</c:if>
	
	<c:if
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
							NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.UPDATE)%>">
		<portlet:renderURL var="editURL">
			<portlet:param name="Id"
				value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
			<portlet:param name="mvcPath" value="/bookstore/update.jsp" />
			<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%=editURL.toString()%>"></liferay-ui:icon>
	</c:if>
	
	<c:if
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
							NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.DELETE)%>">
		<portlet:actionURL name="deleteBookstore" var="deleteURL">
			<portlet:param name="Id"
				value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete image="delete" url="<%=deleteURL.toString()%>"></liferay-ui:icon-delete>
	</c:if>
</liferay-ui:icon-menu>