<%@ include file="../init.jsp"%>
<%@ include file="../home.jsp"%>

<%
	String backURL = ParamUtil.getString(request, "backURL");
%>
<liferay-ui:header backURL="<%=backURL.toString()%>" title="label.bookstore" />
<%
	long bookstoreId = ParamUtil.getLong(renderRequest, "Id");
	Bookstore bookstore = null;
	if (bookstoreId > 0) {
		bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
%>
<c:choose>
	<c:when
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
								NabookAdminConstants.PORTLET_NABOOKADMIN, NabookActionKeys.UPDATE)%>">

		<portlet:actionURL name="updateBookstore" var="updateBookstoreURL" />

		<aui:form action="<%=updateBookstoreURL%>">
			<aui:model-context bean="<%=bookstore%>" model="<%=Bookstore.class%>" />

			<aui:fieldset>
				<aui:input name="bookstoreId" type="hidden"
					value="<%=bookstore.getBookstoreId()%>"></aui:input>
				<aui:input name="name" type="text" label="bookstore.name" required="true"></aui:input>
				<aui:select name="country" id="country" label="bookstore.country"
					required="true">
					<%
						List<Country> countries = CountryServiceUtil.getCountries();
						for (Country country : countries) {
							if (country.isActive()) {
					%>
					<aui:option value="<%=country.getA2()%>"
						selected='<%=country.getA2().equalsIgnoreCase(bookstore.getCountry()) ? true : false%>'>
						<%=LanguageUtil.get(themeDisplay.getLocale(),
												"country." + country.getName())%>
					</aui:option>
					<%
							}
						}
					%>
				</aui:select>
				<aui:select name="city" id="city" type="text" label="bookstore.city" required="true"></aui:select>
				<aui:input name="prefecture" type="text" label="bookstore.prefecture" required="true"></aui:input>
				<aui:input name="street" type="text" label="bookstore.street" required="true"></aui:input>
				<aui:input name="zip" type="number" label="bookstore.zip">
					<aui:validator name="digits"></aui:validator>
				</aui:input>
				<aui:input name="phone" type="number" label="bookstore.phone" required="true">
					<aui:validator name="digits"></aui:validator>
				</aui:input>
				<aui:input name="description" type="textarea" label="bookstore.description"></aui:input>
			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit"
					name='<%=bookstore == null ? "btn.add" : "btn.update"%>' />
				<aui:button type="cancel" name="btn.cancel"
					onClick="<%= backURL.toString() %>" />
			</aui:button-row>
		</aui:form>
	</c:when>
	<c:otherwise>
		<%=LanguageUtil.get(request, "permission.access.page")%>
	</c:otherwise>
</c:choose>

<%
	} else {
%>
	<%= LanguageUtil.get(request, "message.error.missing.bookstoreid") %>
<%
	}
%>
<portlet:resourceURL var="getRegionURL"></portlet:resourceURL>
<aui:script use="aui-base, aui-io-request">

	AUI().use(function(A){
		A.one('#<portlet:namespace/>country').on('change', function(){
			selectedValue = A.one('#<portlet:namespace/>country').get('value');
			var cityList = document.getElementById("<portlet:namespace/>city");
			while (cityList.hasChildNodes()){
				cityList.removeChild(cityList.firstChild);
			}

			A.io.request(
				'<%= getRegionURL %>',
				{
					dataType : 'json',
					method : 'POST',
					data : {<portlet:namespace />countryA2 : selectedValue},
					on : {success : function() {
						var data = this.get('responseData');
						if (data) {
							var regions = JSON.parse(data.regions);	
							for ( var i = 0; i < regions.length; i++) {
								option = document.createElement("option");
								option.value = regions[i];
								option.text = regions[i];
								cityList.appendChild(option);
							}
							cityList.value = city;
						}
					}}
				}
			);
		});
	})
</aui:script>