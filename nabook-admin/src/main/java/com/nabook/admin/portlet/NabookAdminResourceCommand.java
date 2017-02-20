package com.nabook.admin.portlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Region;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.service.CountryServiceUtil;
import com.liferay.portal.kernel.service.RegionServiceUtil;
import com.nabook.admin.constants.NabookAdminConstants;

@Component(
	immediate = true, 
	property = {
		"javax.portlet.name=" + NabookAdminConstants.PORTLET_NABOOKADMIN
	}, 
	service = MVCResourceCommand.class
)
public class NabookAdminResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String countryA2 = resourceRequest.getParameter("countryA2");
		JSONArray jsonResults = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObj;

		if (!countryA2.isEmpty()) {
			List<Region> regions;
			try {
				regions = RegionServiceUtil.getRegions(CountryServiceUtil.getCountryByA2(countryA2).getCountryId());
				if (regions.size() > 0) {
					for (Region region : regions) {
						jsonResults.put(region.getName());
					}
				}
				jsonObj = JSONFactoryUtil.createJSONObject();
				jsonObj.put("regions", jsonResults.toString());
				resourceResponse.setContentType("application/json");
				resourceResponse.setCharacterEncoding("UTF-8");
				resourceResponse.getWriter().write(jsonObj.toString());
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

}
