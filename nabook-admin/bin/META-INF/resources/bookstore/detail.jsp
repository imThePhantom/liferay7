<%@ include file="../init.jsp"%>
<%@ include file="../home.jsp"%>

<%
	long bookstoreId = ParamUtil.getLong(request, "Id");
	if (bookstoreId > 0) {
		Bookstore bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
		bookstore = bookstore.toEscapedModel();

		String currentURL = PortalUtil.getCurrentURL(request);
		PortalUtil.setPageSubtitle(bookstore.getName(), request);
%>

<c:choose>
	<c:when
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
								NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.VIEW)%>">
		<liferay-ui:panel-container extended="<%=false%>" persistState="<%=true%>"
			id="bookstoreCollaborationPanelContainer">

			<portlet:renderURL var="viewURL">
				<portlet:param name="mvcPath" value="/bookstore/view.jsp" />
			</portlet:renderURL>

			<liferay-ui:panel title="label.detail">
				<liferay-ui:header backURL="<%=viewURL.toString()%>"
					title="<%=bookstore.getName()%>" />
			
		Address: <%=bookstore.getCity() + ", " + bookstore.getPrefecture() + ", "
										+ bookstore.getStreet()%><br />
		Zip: <%=LanguageUtil.get(request, "symbol.postal") + bookstore.getZip()%><br />
		Tel: <%=bookstore.getPhone()%><br />
		Des: <%=bookstore.getDescription()%><br />
		
				<liferay-ui:icon-list>
					<c:if
						test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
												NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.UPDATE)%>">

						<portlet:renderURL var="editURL">
							<portlet:param name="Id"
								value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
							<portlet:param name="mvcPath" value="/bookstore/update.jsp" />
							<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
						</portlet:renderURL>
						<liferay-ui:icon image="edit" message="label.edit"
							url="<%=editURL.toString()%>"></liferay-ui:icon>

					</c:if>
					<c:if
						test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
												NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.DELETE)%>">

						<portlet:actionURL name="deleteBookstore" var="deleteURL">
							<portlet:param name="bookstoreId"
								value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
						</portlet:actionURL>

						<liferay-ui:icon-delete image="delete" message="label.delete"
							url="<%=deleteURL.toString()%>"></liferay-ui:icon-delete>
					</c:if>

				</liferay-ui:icon-list>
			</liferay-ui:panel>

			<liferay-ui:panel title="label.rating" collapsible="<%=true%>"
				extended="<%=true%>" persistState="<%=true%>">
				<liferay-ui:ratings classPK="<%=bookstore.getBookstoreId()%>"
					className="<%=Bookstore.class.getName()%>" type="stars">
				</liferay-ui:ratings>
			</liferay-ui:panel>

		</liferay-ui:panel-container>
	</c:when>
	<c:otherwise>
		<%=LanguageUtil.get(request, "permission.perform.view")%>
	</c:otherwise>
</c:choose>

<%
	} else {
%>
<%=LanguageUtil.get(request, "message.error.missing.bookstoreid")%>
<%
	}
%>
