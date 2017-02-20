<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nabook.model.Bookstore"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
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
<%@ include file="/view.jsp" %>

<% 
	long bookstoreId = ParamUtil.getLong(request, "bookstoreId");
	Bookstore bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
	bookstore = bookstore.toEscapedModel();
	
	String currentURL = PortalUtil.getCurrentURL(request);
	PortalUtil.setPageSubtitle(bookstore.getName(), request);
%>

<dl>
	<dt><%=bookstore.getName() %>
	<dd>Address: <%= bookstore.getCity() + ", " + bookstore.getPrefecture()
						+ ", " +	bookstore.getStreet()%> </dd>
	<dd><%= bookstore.getPhone() %></dd>
</dl>

<liferay-ui:panel-container extended="<%= false %>" persistState="<%= true %>" 
	id="bookstoreCollaborationPanelContainer">
	<liferay-ui:panel title="rating" collapsible="<%= true %>" extended="<%= true %>" persistState="<%= true %>">
		<liferay-ui:ratings classPK="<%= bookstore.getBookstoreId() %>" 
			className="<%= Bookstore.class.getName() %>" type="stars">
		</liferay-ui:ratings>
	</liferay-ui:panel>
</liferay-ui:panel-container>