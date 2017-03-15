<%@ include file="../init.jsp"%>

<%
	String title = LanguageUtil.get(request, "title.detail.author");
	String backURL = ParamUtil.getString(request, "backURL");

	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(backURL);

	long authorId = ParamUtil.getLong(request, "Id");
	if (authorId > 0) {
		Author author = AuthorLocalServiceUtil.getAuthor(authorId);
		PortletURL iteratorURL = renderResponse.createActionURL();
		iteratorURL.setParameter("mvcPath", "/author/detail.jsp");
		
		renderResponse.setTitle(title + ": " + author.getFullName());
%>

<c:choose>
	<c:when
		test="<%=AuthorPermissionChecker.contains(permissionChecker, author,
								NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.VIEW)%>">
		<liferay-ui:panel-container extended="<%=false%>" persistState="<%=true%>"
			id="authorCollaborationPanelContainer">

			<liferay-ui:panel title="author.profile">
				<c:out value="<%=author.getProfile()%>" escapeXml="false"></c:out>
			</liferay-ui:panel>

			<br />

			<liferay-ui:icon-list>
				<c:if
					test="<%=AuthorPermissionChecker.contains(permissionChecker, author,
											NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.UPDATE)%>">
					<portlet:renderURL var="editAuthorURL">
						<portlet:param name="mvcPath" value="/author/update.jsp" />
						<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
						<portlet:param name="Id" value="<%=String.valueOf(author.getAuthorId())%>" />
					</portlet:renderURL>

					<liferay-ui:icon image="edit" message="label.edit"
						url="<%=editAuthorURL.toString()%>"></liferay-ui:icon>
				</c:if>
				<c:if
					test="<%=AuthorPermissionChecker.contains(permissionChecker, author,
											NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.DELETE)%>">

					<portlet:actionURL name="<%=NabookConstants.ACTION_AUTHOR%>"
						var="deleteAuthorURL">
						<portlet:param name="<%=NabookConstants.CMD%>"
							value="<%=NabookConstants.DELETE%>" />
						<portlet:param name="Id" value="<%=String.valueOf(author.getAuthorId())%>" />
					</portlet:actionURL>

					<liferay-ui:icon-delete image="delete" message="label.delete"
						url="<%=deleteAuthorURL.toString()%>" confirmation="confirmation.delete.author"></liferay-ui:icon-delete>
				</c:if>
			</liferay-ui:icon-list>

			<br />

			<liferay-ui:panel title="label.books">
				<%
					List<Book> books = BookLocalServiceUtil.getAuthorBooks(author.getAuthorId());
				%>

				<liferay-ui:search-container total="<%=books.size()%>" delta="5"
					iteratorURL="<%=iteratorURL%>" orderByType="asc" orderByCol="title"
					emptyResultsMessage="message.empty.authorbooks">

					<%
						System.out.print("size:" + books.size());
												List<Book> paging = ListUtil.subList(books, searchContainer.getStart(),
														searchContainer.getEnd());
												System.out.print("sub size:" + paging.size());
					%>

					<liferay-ui:search-container-results results="<%=paging%>" />
					<liferay-ui:search-container-row className="com.nabook.model.Book"
						modelVar="book">
						<c:choose>
							<c:when
								test="<%=BookPermissionChecker.contains(permissionChecker, book,
														NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.VIEW)%>">
								<portlet:renderURL var="viewBookURL">
									<portlet:param name="mvcPath" value="/book/detail.jsp" />
									<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
									<portlet:param name="Id" value="<%=String.valueOf(book.getBookId())%>" />
								</portlet:renderURL>
								<liferay-ui:search-container-column-text property="title"
									href="<%=viewBookURL.toString()%>" name="book.title"></liferay-ui:search-container-column-text>
							</c:when>
							<c:otherwise>
								<%=LanguageUtil.get(request, "permission.perform.view")%>
							</c:otherwise>
						</c:choose>
					</liferay-ui:search-container-row>

					<liferay-ui:search-iterator searchContainer="<%=searchContainer%>"
						paginate="<%=true%>" />
				</liferay-ui:search-container>
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
<%=LanguageUtil.get(request, "message.error.missing.authorid")%>
<%
	}
%>
