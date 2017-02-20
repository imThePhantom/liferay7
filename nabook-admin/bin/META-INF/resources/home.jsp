<%@ include file="init.jsp" %>

<h1>NA Book Admin</h1>

<portlet:renderURL var="tabBookstoreURL">
	<portlet:param name="mvcPath" value="/bookstore/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="tabBookURL">
	<portlet:param name="mvcPath" value="/book/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="tabStockItemURL">
	<portlet:param name="mvcPath" value="/stockitem/view.jsp" />
</portlet:renderURL>

<aui:nav-bar>
	<aui:nav cssClass="nav-tabs">
		<aui:nav-item href="<%=tabBookstoreURL%>" label="label.bookstore"></aui:nav-item>
		<aui:nav-item href="<%=tabBookURL%>" label="label.book"></aui:nav-item>
		<aui:nav-item href="<%=tabStockItemURL%>" label="label.stockitem"></aui:nav-item>
	</aui:nav>
</aui:nav-bar>
