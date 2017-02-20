<%@ page import="com.liferay.portal.kernel.search.Field"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.security.auth.CompanyThreadLocal"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.nabook.service.BookstoreLocalServiceUtil"%>
<%@ page import="com.nabook.model.Bookstore"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page import="com.nabook.constants.WebKeys"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />