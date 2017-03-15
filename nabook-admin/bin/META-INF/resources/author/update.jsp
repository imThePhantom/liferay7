<%@ include file="../init.jsp"%>

<%
	String title = LanguageUtil.get(request, "title.update.author");
	String backURL = ParamUtil.getString(request, "backURL");

	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(backURL);

	long authorId = ParamUtil.getLong(request, "Id");
	Author author = null;
	if (authorId > 0) {
		author = AuthorLocalServiceUtil.getAuthor(authorId);
		renderResponse.setTitle(title + ": " + author.getFullName());
%>

<c:choose>
	<c:when
		test="<%=AuthorPermissionChecker.contains(permissionChecker, author,
								NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.UPDATE)%>">

		<portlet:actionURL name="<%=NabookConstants.ACTION_AUTHOR%>"
			var="updateAuthorURL">
			<portlet:param name="<%=NabookConstants.CMD%>"
				value="<%=NabookConstants.UPDATE%>" />
		</portlet:actionURL>

		<aui:form action="<%=updateAuthorURL%>"
			onSubmit='<%= renderResponse.getNamespace() +"saveAuthor();"%>'
			name="update_author">
			<aui:model-context bean="<%=author%>" model="<%=Author.class%>" />

			<aui:fieldset>
				<aui:input name="authorId" type="hidden" value="<%=author.getAuthorId()%>"></aui:input>
				<aui:input name="fullName" type="text" label="author.fullname"
					required="true"></aui:input>
				<aui:input name="profile" id="profile" type="hidden"></aui:input>

				<label for="profileEditor"><%=LanguageUtil.get(request, "author.profile")%></label>
				<liferay-ui:input-editor height="500px" width="80%" name="profileEditor"
					initMethod="profileEditorInit" editorName="ckeditor" />

			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit" name="btn.update"></aui:button>
				<aui:button type="cancel" name="btn.cancel"
					onClick="<%= backURL.toString() %>"></aui:button>
			</aui:button-row>
		</aui:form>

		<aui:script>
			function <portlet:namespace />profileEditorInit() {
				return document.getElementById('<portlet:namespace />profile').value;
			}
			function <portlet:namespace />saveAuthor() {
				var editor = window.<portlet:namespace />profileEditor.getHTML();
				document.<portlet:namespace />update_author.<portlet:namespace />profile.value = editor;
				document.<portlet:namespace />update_author.action = '<%=updateAuthorURL%>';
				submitForm(<portlet:namespace />update_author);
			}
		</aui:script>
			

	
		</c:when>
	<c:otherwise>
		<%=LanguageUtil.get(request, "permission.access.page")%>
	</c:otherwise>
</c:choose>

<%
	} else {
%>
<%=LanguageUtil.get(request, "message.error.missing.authorid")%>
<%
	}
%>
