<%@ include file="../init.jsp"%>

<%
	String title = LanguageUtil.get(request, "title.detail.store");
	String backURL = ParamUtil.getString(request, "backURL");

	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(backURL);

	long bookstoreId = ParamUtil.getLong(request, "Id");
	if (bookstoreId > 0) {
		Bookstore bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
		renderResponse.setTitle(title + ": " + bookstore.getName());
%>

<c:choose>
	<c:when
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
								NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.VIEW)%>">
		<liferay-ui:panel-container extended="<%=false%>" persistState="<%=true%>"
			id="bookstoreCollaborationPanelContainer">

			<liferay-ui:panel title="panel.info" cssClass="collapse-icon">
				Address: <%=bookstore.getCity() + ", " + bookstore.getPrefecture() + ", "
										+ bookstore.getStreet()%><br />
				Zip: <%=LanguageUtil.get(request, "symbol.postal") + bookstore.getZip()%><br />
				Tel: <%=bookstore.getPhone()%><br />
			</liferay-ui:panel>

			<liferay-ui:panel title="panel.description"><%=bookstore.getDescription()%></liferay-ui:panel>

			<liferay-ui:icon-list>
				<c:if
					test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
											NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.UPDATE)%>">

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
											NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.DELETE)%>">

					<portlet:actionURL name="<%=NabookConstants.ACTION_BOOKSTORE%>"
						var="deleteURL">
						<portlet:param name="<%=NabookConstants.CMD%>"
							value="<%=NabookConstants.DELETE%>" />
						<portlet:param name="bookstoreId"
							value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
					</portlet:actionURL>

					<liferay-ui:icon-delete image="delete" message="label.delete"
						url="<%=deleteURL.toString()%>" confirmation="confirmation.delete.store" />
				</c:if>

			</liferay-ui:icon-list>


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

