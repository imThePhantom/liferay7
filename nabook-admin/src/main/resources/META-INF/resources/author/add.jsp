<%@ include file="../init.jsp"%>


<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/author/view.jsp" />
</portlet:renderURL>

<%
	String backURL = ParamUtil.getString(request, "backURL");
	if (backURL.length() < 1) {
		backURL = viewURL.toString();
	}

	renderResponse.setTitle(LanguageUtil.get(request, "title.add.author"));
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(backURL);

	Author author = null;
%>

<portlet:actionURL name="<%=NabookConstants.ACTION_AUTHOR%>"
	var="addAuthorURL">
	<portlet:param name="<%=NabookConstants.CMD%>" value="<%=NabookConstants.ADD%>" />
</portlet:actionURL>

<c:choose>
	<c:when
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							ActionKeys.ADD_AUTHOR)%>">
		<aui:form action="<%=addAuthorURL%>"
			onSubmit='<%= renderResponse.getNamespace() +"saveAuthor();"%>'
			name="add_author">
			<aui:model-context bean="<%=author%>" model="<%=Author.class%>" />

			<aui:fieldset>
				<aui:input name="fullName" type="text" label="author.fullname"
					required="true"></aui:input>

				<label for="profile"><%=LanguageUtil.get(request, "author.profile")%></label>
				<liferay-ui:input-editor height="500px" width="80%" name="profile"
					initMethod="profileEditorInit" editorName="ckeditor"
					configKey="profileEditor" toolbarSet="simple" />

			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit" name="btn.add"></aui:button>
				<aui:button type="cancel" name="btn.cancel"
					onClick="<%= backURL.toString() %>"></aui:button>
			</aui:button-row>
		</aui:form>
		<aui:script>
			function <portlet:namespace />profileEditorInit() {
			}
			function <portlet:namespace />saveAuthor() {
				document.<portlet:namespace />add_author.action = '<%=addAuthorURL%>';
			}
		</aui:script>
		</c:when>
	<c:otherwise>
		<%=LanguageUtil.get(request, "permission.access.page")%>
	</c:otherwise>
</c:choose>
