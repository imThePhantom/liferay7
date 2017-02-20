<%@page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@ include file="init.jsp" %>

<h1>NABook</h1>

<aui:button-row cssClass="btns">
	<portlet:renderURL var="BookstoreURL">
		<portlet:param name="mvcPath" value="/bookstore/store.jsp" />
		<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
	</portlet:renderURL>
	<aui:button onClick="<%= BookstoreURL.toString() %>" value="bookstore.list" />
</aui:button-row>