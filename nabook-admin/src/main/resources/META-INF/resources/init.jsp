<%@page import="java.util.List"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.security.auth.CompanyThreadLocal"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.nabook.admin.constants.NabookAdminConstants"%>
<%@page import="com.nabook.admin.constants.NabookActionKeys"%>
<%@ page import="com.nabook.service.BookstoreLocalServiceUtil"%>
<%@ page import="com.nabook.service.permission.NabookResourcePermissionChecker"%>
<%@ page import="com.nabook.service.permission.BookstorePermissionChecker"%>
<%@ page import="com.nabook.model.Bookstore"%>
<%@ page import="com.nabook.admin.constants.WebKeys"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet"%>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ taglib prefix="liferay-security" uri="http://liferay.com/tld/security" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />