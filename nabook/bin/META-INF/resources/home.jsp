<%@page import="javax.portlet.WindowState"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@ include file="init.jsp"%>

<%
	renderResponse.setTitle(LanguageUtil.get(request, "title.portlet"));
%>

<aui:button-row cssClass="btns">
	<portlet:renderURL var="BookstoreURL">
		<portlet:param name="mvcPath" value="/bookstore/store.jsp" />
		<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
	</portlet:renderURL>

	<aui:button onClick="<%= BookstoreURL.toString() %>" value="bookstore.list" />
</aui:button-row>