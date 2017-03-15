<%@page import="com.liferay.ratings.kernel.service.RatingsStatsLocalServiceUtil"%>
<%@page import="com.liferay.ratings.kernel.model.RatingsStats"%>
<%@ include file="../init.jsp"%>

<%
	long bookstoreId = ParamUtil.getLong(request, "Id");
	if (bookstoreId > 0) {
		Bookstore bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
		bookstore = bookstore.toEscapedModel();

		String backURL = ParamUtil.getString(request, "backURL");
		PortalUtil.setPageSubtitle(bookstore.getName(), request);
%>

<liferay-ui:panel-container extended="<%=false%>" persistState="<%=true%>"
	id="bookstoreCollaborationPanelContainer">

	<liferay-ui:panel title="label.detail">
		<liferay-ui:header backURL="<%=backURL%>" title="<%=bookstore.getName()%>" />
		Address: <%=bookstore.getCity() + ", " + bookstore.getPrefecture() + ", " + bookstore.getStreet()%><br />
		Zip: <%=LanguageUtil.get(request, "symbol.postal") + bookstore.getZip()%><br />
		Tel: <%=bookstore.getPhone()%><br />
		Des: <%=bookstore.getDescription()%><br />
	</liferay-ui:panel>


	<liferay-ui:panel title="label.rating" collapsible="<%=true%>"
		extended="<%=true%>" persistState="<%=true%>">
		<c:choose>
			<c:when test="<%=themeDisplay.isSignedIn()%>">
				<liferay-ui:ratings classPK="<%=bookstore.getBookstoreId()%>"
					className="<%=Bookstore.class.getName()%>" type="stars">
				</liferay-ui:ratings>
			</c:when>
			<c:otherwise>
				<%
					RatingsStats ratingsStats = RatingsStatsLocalServiceUtil
												.getStats(Bookstore.class.getName(), bookstoreId);
				%>
				<liferay-ui:ratings-score score="<%=ratingsStats.getAverageScore()%>"></liferay-ui:ratings-score>
			</c:otherwise>
		</c:choose>
	</liferay-ui:panel>
</liferay-ui:panel-container>


<%
	} else {
%>
<%=LanguageUtil.get(request, "message.error.missing.bookstoreid")%>
<%
	}
%>

