<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>

<%@ include file="../init.jsp"%>

<%
	RowChecker rowChecker = new RowChecker(renderResponse);
%>

<div class="search-form" style="float: right;margin:10px;">
	<span class="aui-search-bar">
		<aui:input name="keywords" label="label.author.name" 
			inlineField="<%=true%>" type="text"
			id="search-field"></aui:input>
		<aui:button type="submit" icon="icon-search"
			value="label.search"></aui:button>
	</span>
</div>
<div style="clear: both;"></div>

