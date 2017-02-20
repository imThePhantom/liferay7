<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page
	import="com.liferay.portal.kernel.security.auth.CompanyThreadLocal"%>
<%@ page import="com.nabook.service.BookstoreLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page import="com.nabook.constants.WebKeys"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%@ include file="/view.jsp"%>

<%
	Long companyId = CompanyThreadLocal.getCompanyId();
%>

<h1>Store</h1>

<aui:panel>
	<aui:button-row cssClass="admin-btns">
		<portlet:renderURL var="addBookstoreURL">
			<portlet:param name="mvcPath" value="/bookstore/edit_store.jsp" />
		</portlet:renderURL>
		<aui:button onClick="<%= addBookstoreURL.toString() %>"
			value="bookstore.add" />
	</aui:button-row>

	<liferay-ui:search-container total="<%= BookstoreLocalServiceUtil.countBookstores(companyId)%>" 
		emptyResultsMessage="message.empty.bookstore">
		<liferay-ui:search-container-results results="<%= BookstoreLocalServiceUtil.getAllBookstores(companyId, 
				searchContainer.getStart(), searchContainer.getEnd())%>" />
		<liferay-ui:search-container-row
			className="com.nabook.model.Bookstore" modelVar="bookstore">
			<portlet:renderURL var="viewBookstoreURL">
				<portlet:param name="mvcPath" value="/bookstore/detail.jsp" />
				<portlet:param name="bookstoreId"
					value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
			</portlet:renderURL>

			<liferay-ui:search-container-column-text property="name"
				href="<%=viewBookstoreURL.toString()%>" name="bookstore.name"/>
			<liferay-ui:search-container-column-text name="bookstore.address" 
				value='<%= bookstore.getCity() + ", " + bookstore.getPrefecture()
						+ ", " +	bookstore.getStreet()%>'/>
			<liferay-ui:search-container-column-text property="phone"
				name="bookstore.phone" />
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:panel>