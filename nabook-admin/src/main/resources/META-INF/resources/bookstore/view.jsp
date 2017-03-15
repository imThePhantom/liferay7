<%@ include file="../home.jsp"%>

<%
	long companyId = CompanyThreadLocal.getCompanyId();
	PortletURL iteratorURL = renderResponse.createActionURL();
	iteratorURL.setParameter("mvcPath", "/bookstore/view.jsp");
%>

<liferay-ui:panel title="title.manage.store">
	<liferay-ui:search-container
		total="<%=BookstoreLocalServiceUtil.countBookstores()%>"
		emptyResultsMessage="message.empty.bookstore" iteratorURL="<%=iteratorURL%>">

		<liferay-ui:search-container-results 
			results="<%= BookstoreLocalServiceUtil.getAllBookstores(searchContainer.getStart(), 
					searchContainer.getEnd())%>" />

		<liferay-ui:search-container-row className="com.nabook.model.Bookstore"
			modelVar="bookstore">
			<c:choose>
				<c:when
					test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
										NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.VIEW)%>">
					<portlet:renderURL var="viewBookstoreURL">
						<portlet:param name="mvcPath" value="/bookstore/detail.jsp" />
						<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
						<portlet:param name="Id"
							value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
					</portlet:renderURL>

					<liferay-ui:search-container-column-text property="name"
						href="<%=viewBookstoreURL.toString()%>" name="bookstore.name" />
					<liferay-ui:search-container-column-text name="bookstore.address"
						href="<%=viewBookstoreURL.toString()%>"
						value='<%=LanguageUtil.get(request, "symbol.postal") + bookstore.getZip() + ", "
										+ bookstore.getCity() + ", " + bookstore.getPrefecture() + ", "
										+ bookstore.getStreet()%>' />

					<liferay-ui:search-container-column-text property="phone"
						name="bookstore.phone" />

					<liferay-ui:search-container-column-jsp path="/bookstore/action_menu.jsp"
						align="right" />
				</c:when>
				<c:otherwise>
					<%=LanguageUtil.get(request, "permission.perform.view")%>
				</c:otherwise>
			</c:choose>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</liferay-ui:panel>
