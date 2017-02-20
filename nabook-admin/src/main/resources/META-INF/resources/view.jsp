<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

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