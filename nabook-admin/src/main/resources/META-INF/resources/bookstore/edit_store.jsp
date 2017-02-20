<%@page import="com.nabook.model.Bookstore"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.security.auth.CompanyThreadLocal"%>
<%@ page import="com.nabook.service.BookstoreLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@ include file="/view.jsp"%>

<%
	long bookstoreId = ParamUtil.getLong(renderRequest, "bookstoreId");
	Bookstore bookstore = null;
	if (bookstoreId > 0) {
		bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/bookstore/view.jsp"/>
</portlet:renderURL>

<liferay-ui:header backURL="<%= viewURL.toString() %>" title="label.bookstore" />

<liferay-ui:error key="error" message="message.error.exception" />

<portlet:actionURL name= '<%= bookstore == null ? "addBookstore" : "updateBookstore" %>'
	var="editBookstoreURL">
</portlet:actionURL>

<aui:form action="<%=editBookstoreURL%>">
	<aui:model-context bean="<%= bookstore %>" model="<%= Bookstore.class %>"/>
	
	<aui:fieldset>
		<aui:input name="bookstoreId" type="hidden" 
			value='<%= bookstore == null ? "" : bookstore.getBookstoreId()%>'></aui:input>
		<aui:input name="name">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="country">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="city">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="prefecture">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="street">
			<aui:validator name="required" />
		</aui:input>
		<aui:input name="zip">
			<aui:validator name="digits"></aui:validator>
		</aui:input>
		<aui:input name="phone">
			<aui:validator name="digits"></aui:validator>
			<aui:validator name="required" />
		</aui:input>
	</aui:fieldset>
	
	<aui:button-row>
		<aui:button type="submit" name='<%= bookstore == null ? "btn.add" : "btn.update" %>' />
		<aui:button type="cancel" name="btn.cancel" onClick="<%= viewURL.toString() %>" />
	</aui:button-row>
</aui:form>