<%@ include file="../home.jsp"%>


<%
	
	long companyId = CompanyThreadLocal.getCompanyId();
	PortletURL iteratorURL = renderResponse.createActionURL();
	iteratorURL.setParameter("mvcPath", "/author/view.jsp");
%>

<liferay-ui:panel title="title.manage.author">
	<liferay-ui:search-container 
		total="<%=AuthorLocalServiceUtil.countAllAuthor() %>"
		emptyResultsMessage="message.empty.author"
		iteratorURL="<%= iteratorURL %>">
		
		<liferay-ui:search-container-results results="<%=AuthorLocalServiceUtil.getAllAuthors(searchContainer.getStart(), 
				searchContainer.getEnd()) %>" />
		
		<liferay-ui:search-container-row className="com.nabook.model.Author" modelVar="author">
			<c:choose>
				<c:when test="<%=AuthorPermissionChecker.contains(permissionChecker, 
						author, NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.VIEW) %>">
					<portlet:renderURL var="viewProfileURL">
						<portlet:param name="mvcPath" value="/author/detail.jsp"/>
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>"/>
						<portlet:param name="Id" value="<%=String.valueOf(author.getAuthorId()) %>"/>
					</portlet:renderURL>
					<liferay-ui:search-container-column-text property="fullName" 
						href="<%=viewProfileURL.toString() %>" name="author.name"/>
				</c:when>
				<c:otherwise>
					<%= LanguageUtil.get(request, "permission.perform.view") %>
				</c:otherwise>
			</c:choose>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</liferay-ui:panel>
