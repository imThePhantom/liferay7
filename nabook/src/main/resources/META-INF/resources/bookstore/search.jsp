<%@ include file="../init.jsp"%>

<%
	String backURL = ParamUtil.getString(request, "backURL");
	String keywords = ParamUtil.getString(request, "keywords");
	long companyId = CompanyThreadLocal.getCompanyId();
%>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/bookstore/search.jsp" />
	<portlet:param name="backURL" value="<%=backURL%>" />
</liferay-portlet:renderURL>

<aui:form action="<%=searchURL.toString()%>" method="get" name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
	<liferay-ui:header backURL="<%=backURL%>" title="label.search" />

	<div class="search-form">
		<span class="aui-search-bar"> <aui:input name="keywords"
				inlineField="<%=true%>" type="text" title="search-store" id="search-field" />
			<aui:button type="submit" icon="icon-search" value="label.search"></aui:button>
		</span>
	</div>
</aui:form>

<%
	List<Bookstore> bookstores = BookstoreLocalServiceUtil.search(companyId, keywords);
%>

<liferay-ui:search-container delta="5" total="<%=bookstores.size()%>"
	emptyResultsMessage="message.empty.bookstore" iteratorURL="<%=searchURL%>"
	orderByType="asc" orderByCol="name">
	<%
		List<Bookstore> paging = ListUtil.subList(bookstores, searchContainer.getStart(),
					searchContainer.getEnd());
	%>
	<liferay-ui:search-container-results results="<%=paging%>" />

	<liferay-ui:search-container-row className="com.nabook.model.Bookstore"
		modelVar="bookstore">
		<portlet:renderURL var="viewBookstoreURL">
			<portlet:param name="mvcPath" value="/bookstore/detail.jsp" />
			<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
			<portlet:param name="Id"
				value="<%=String.valueOf(bookstore.getBookstoreId())%>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text property="name"
			href="<%=viewBookstoreURL.toString()%>" name="bookstore.name" />
		<liferay-ui:search-container-column-text name="bookstore.address"
			href="<%=viewBookstoreURL.toString()%>"
			value='<%=LanguageUtil.get(request, "symbol.postal") + bookstore.getZip() + ", "
							+ bookstore.getCity() + ", " + bookstore.getPrefecture() + ", " + bookstore.getStreet()%>' />

		<liferay-ui:search-container-column-text property="phone"
			name="bookstore.phone" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>"
		paginate="<%=true%>" />
</liferay-ui:search-container>