<%@ include file="../init.jsp"%>

<%
	String title = LanguageUtil.get(request, "title.update.store");
	String backURL = ParamUtil.getString(request, "backURL");

	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(backURL);

	long bookstoreId = ParamUtil.getLong(renderRequest, "Id");
	Bookstore bookstore = null;
	if (bookstoreId > 0) {
		bookstore = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
		renderResponse.setTitle(title + ": " + bookstore.getName());
%>

<portlet:resourceURL var="getRegionURL" id="getRegion"></portlet:resourceURL>

<portlet:actionURL name="<%=NabookConstants.ACTION_BOOKSTORE%>"
	var="updateBookstoreURL">
	<portlet:param name="<%=NabookConstants.CMD%>"
		value="<%=NabookConstants.UPDATE%>" />
</portlet:actionURL>

<c:choose>
	<c:when
		test="<%=BookstorePermissionChecker.contains(permissionChecker, bookstore,
								NabookConstants.PORTLET_NABOOKADMIN, ActionKeys.UPDATE)%>">

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
						selected='<%=country.getA2().equalsIgnoreCase(bookstore.getCountry())
														? true
														: false%>'>
						<%=LanguageUtil.get(themeDisplay.getLocale(),
														"country." + country.getName())%>
					</aui:option>
					<%
						}
												}
					%>
				</aui:select>
				<aui:select name="city" id="city" label="bookstore.city" required="true"
					value="<%=bookstore.getCity()%>"></aui:select>
				<aui:input name="prefecture" type="text" label="bookstore.prefecture"
					required="true"></aui:input>
				<aui:input name="street" type="text" label="bookstore.street"
					required="true"></aui:input>
				<aui:input name="zip" type="text" label="bookstore.zip"></aui:input>
				<aui:input name="phone" type="text" label="bookstore.phone" required="true"></aui:input>
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

<aui:script use="aui-base, aui-io-request">
	AUI().ready(function(A){
		Liferay.on('allPortletsReady', function(){
			var selectedCountry = A.one('#<portlet:namespace/>country').get('value');
			var cityList = document.getElementById("<portlet:namespace/>city");
			var selectedCity = "<%= bookstore.getCity()%>";
			console.log("load regions");
			A.io.request(
				'<%= getRegionURL %>',
				{
					dataType : 'json',
					method : 'POST',
					data : {<portlet:namespace />countryA2 : selectedCountry},
					on : {success : function() {
						var data = this.get('responseData');
						if (data) {
							var regions = JSON.parse(data.regions);	
							for ( var i = 0; i < regions.length; i++) {
								option = document.createElement("option");
								option.value = regions[i];
								option.text = regions[i];
								if (regions[i] == selectedCity) {
									console.log("set selected")
									option.selected = true;
								}
								cityList.appendChild(option);
								console.log("onLoad " + regions[i]);
							}
						}
					}}
				}
			);
		});
	})
	
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
								if (regions[i] == "<%= bookstore.getCity()%>") {
									console.log("set selected")
									option.selected = true;
								}
								cityList.appendChild(option);
								console.log(regions[i]);
							}
						}
					}}
				}
			);
		});
	})
</aui:script>

<%
	} else {
%>
<%=LanguageUtil.get(request, "message.error.missing.bookstoreid")%>
<%
	}
%>
