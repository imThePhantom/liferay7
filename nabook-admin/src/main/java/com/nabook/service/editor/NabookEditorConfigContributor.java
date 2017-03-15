package com.nabook.service.editor;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nabook.util.NabookConstants;

@Component(
	property = {
		"javax.portlet.name=" + NabookConstants.PORTLET_NABOOKADMIN,
		"editor.config.key=profileEditor",
		"editor.name=ckeditor"
	},	
	service = EditorConfigContributor.class
)
public class NabookEditorConfigContributor extends BaseEditorConfigContributor{

	@Override
	public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {
	}
}
