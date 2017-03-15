<%@ include file="../init.jsp"%>

<%
	renderResponse.setTitle(LanguageUtil.get(request, "title.add.book"));

	String backURL = ParamUtil.getString(request, "backURL");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(backURL);
%>

<portlet:actionURL name="<%=NabookConstants.ACTION_BOOK%>" var="addBookURL">
	<portlet:param name="<%=NabookConstants.CMD%>" value="<%=NabookConstants.ADD%>" />
</portlet:actionURL>

<portlet:renderURL var="setAuthorURL"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/book/setAuthor.jsp" />
</portlet:renderURL>

<c:choose>
	<c:when
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							ActionKeys.ADD_BOOK)%>">
		<aui:form action="<%=addBookURL%>">
			<aui:model-context bean="book" model="<%=Book.class%>" />
			<aui:fieldset>
				<aui:input name="isbn" type="text" label="book.isbn" required="true"></aui:input>
				<aui:input name="title" type="text" label="book.title" required="true"></aui:input>
				<aui:input name="subtitle" type="text" label="book.subtitle"></aui:input>
				<aui:input name="edition" type="text" label="book.editon"></aui:input>
				<aui:input name="volume" type="text" label="book.volume"></aui:input>

				<aui:button name="setAuthor" id="setAuthor" icon="icon-search"
					value="Set Author"></aui:button>

			</aui:fieldset>
		</aui:form>
	</c:when>
	<c:otherwise>
		<%=LanguageUtil.get(request, "permisson.access.page")%>
	</c:otherwise>
</c:choose>

<aui:script use="liferay-util-window">
	A.one('#<portlet:namespace/>setAuthor').on('click', function(event) {
		Liferay.Util.openWindow({
			dialog : {
				centered : true,
				height : 800,
				modal : true,
				width : 1000
			},
			id : '<portlet:namespace/>dialog',
			title : 'Select Author',
			uri : '<%=setAuthorURL %>'
		});
	});
</aui:script>