<%@ include file="init.jsp"%>

<portlet:renderURL var="tabAuthorURL">
	<portlet:param name="mvcPath" value="/author/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="tabBookstoreURL">
	<portlet:param name="mvcPath" value="/bookstore/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="tabBookURL">
	<portlet:param name="mvcPath" value="/book/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="tabStockItemURL">
	<portlet:param name="mvcPath" value="/stock/view.jsp" />
</portlet:renderURL>

<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
	<aui:nav cssClass="nav-tabs">
		<aui:nav-item href="<%=tabAuthorURL%>" label="label.author"></aui:nav-item>
		<aui:nav-item href="<%=tabBookURL%>" label="label.book"></aui:nav-item>
		<aui:nav-item href="<%=tabStockItemURL%>" label="label.stockitem"></aui:nav-item>
		<aui:nav-item href="<%=tabBookstoreURL%>" label="label.bookstore"></aui:nav-item>
	</aui:nav>
</aui:nav-bar>

<liferay-frontend:add-menu>
	<c:if
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							ActionKeys.ADD_BOOKSTORE)%>">

		<portlet:renderURL var="addBookstoreURL">
			<portlet:param name="mvcPath" value="/bookstore/add.jsp" />
		</portlet:renderURL>
		<liferay-frontend:add-menu-item url="<%=addBookstoreURL.toString()%>"
			title="<%= LanguageUtil.get(request, "btn.add.store") %>" />
	</c:if>

	<c:if
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							ActionKeys.ADD_AUTHOR)%>">
			<portlet:renderURL var="addAuthorURL">
				<portlet:param name="mvcPath" value="/author/add.jsp" />
			</portlet:renderURL>
			<liferay-frontend:add-menu-item url="<%=addAuthorURL.toString()%>"
			title="<%= LanguageUtil.get(request, "btn.add.author") %>" />
	</c:if>
	<c:if
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							ActionKeys.ADD_BOOK)%>">
			<portlet:renderURL var="addBookURL">
				<portlet:param name="mvcPath" value="/book/add.jsp" />
			</portlet:renderURL>
			<liferay-frontend:add-menu-item url="<%=addBookURL.toString()%>"
			title="<%= LanguageUtil.get(request, "btn.add.book") %>" />
	</c:if>
	<c:if
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							ActionKeys.MANAGE_STOCK)%>">
			<portlet:renderURL var="addStockItemURL">
				<portlet:param name="mvcPath" value="/stock/add.jsp" />
			</portlet:renderURL>
			<liferay-frontend:add-menu-item url="<%=addStockItemURL.toString()%>"
			title="<%= LanguageUtil.get(request, "btn.add.stockitem") %>" />
	</c:if>
</liferay-frontend:add-menu>