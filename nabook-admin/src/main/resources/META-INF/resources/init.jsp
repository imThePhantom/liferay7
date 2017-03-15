<%@ page import="java.util.List"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.model.Country"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.security.auth.CompanyThreadLocal"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.nabook.util.ActionKeys"%>
<%@ page import="com.nabook.util.WebKeys"%>
<%@ page import="com.nabook.util.NabookConstants"%>
<%@ page import="com.nabook.model.Author"%>
<%@ page import="com.nabook.model.Book"%>
<%@ page import="com.nabook.model.Bookstore"%>
<%@ page import="com.nabook.service.AuthorLocalServiceUtil"%>
<%@ page import="com.nabook.service.BookLocalServiceUtil"%>
<%@ page import="com.nabook.service.BookstoreLocalServiceUtil"%>
<%@ page import="com.nabook.service.permission.AuthorPermissionChecker"%>
<%@ page import="com.nabook.service.permission.BookPermissionChecker"%>
<%@ page import="com.nabook.service.permission.BookstorePermissionChecker"%>
<%@ page import="com.nabook.service.permission.NabookResourcePermissionChecker"%>

<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="liferay-frontend" uri="http://liferay.com/tld/frontend" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet"%>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ taglib prefix="liferay-security" uri="http://liferay.com/tld/security"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
 
<liferay-theme:defineObjects />
<portlet:defineObjects />