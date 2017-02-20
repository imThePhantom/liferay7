<%@ include file="../init.jsp"%>
<%@ include file="../home.jsp"%>

<%
	Bookstore bookstore = null;
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/bookstore/view.jsp" />
</portlet:renderURL>

<liferay-ui:header backURL="<%=viewURL.toString()%>" title="label.bookstore" />

<liferay-ui:error key="error" message="message.error.exception" />

<portlet:actionURL name="addBookstore" var="addBookstoreURL"></portlet:actionURL>
<portlet:resourceURL var="getRegionURL"></portlet:resourceURL>
<c:choose>
	<c:when
		test="<%=NabookResourcePermissionChecker.contains(permissionChecker, scopeGroupId,
							NabookActionKeys.ADD_BOOKSTORE)%>">
		<aui:form action="<%=addBookstoreURL%>">
			<aui:model-context bean="<%=bookstore%>" model="<%=Bookstore.class%>" />

			<aui:fieldset>
				<aui:input name="name" type="text" label="bookstore.name" required="true"></aui:input>
				<aui:select name="country" id="country" label="bookstore.country"
					required="true">
					<%
						List<Country> countries = CountryServiceUtil.getCountries();
											for (Country country : countries) {
												if (country.isActive()) {
					%>
					<aui:option value="<%=country.getA2()%>"
						selected='<%=country.getA2().equalsIgnoreCase("US") ? true : false%>'>
						<%=LanguageUtil.get(themeDisplay.getLocale(),
													"country." + country.getName())%>
					</aui:option>
					<%
						}
											}
					%>
				</aui:select>
				<aui:select name="city" id="city" label="bookstore.city" required="true"></aui:select>
				<aui:input name="prefecture" type="text" label="bookstore.prefecture"
					required="true"></aui:input>
				<aui:input name="street" type="text" label="bookstore.street"
					required="true"></aui:input>
				<aui:input name="zip" type="number" label="bookstore.zip">
					<aui:validator name="digits"></aui:validator>
				</aui:input>
				<aui:input name="phone" type="number" label="bookstore.phone"
					required="true">
					<aui:validator name="digits"></aui:validator>
				</aui:input>
				<aui:input name="description" type="textarea" label="bookstore.description"></aui:input>
			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit" name="btn.add" />
				<aui:button type="cancel" name="btn.cancel"
					onClick="<%= viewURL.toString() %>" />
			</aui:button-row>
		</aui:form>
	</c:when>
	<c:otherwise>
		<%=LanguageUtil.get(request, "permission.access.page")%>
	</c:otherwise>
</c:choose>

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