package com.nabook.service.editor;

import java.io.IOException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.servlet.taglib.BaseDynamicInclude;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;
import com.liferay.portal.kernel.util.StreamUtil;

@Component(
		immediate = true,
		service = DynamicInclude.class
)

public class NabookCKEditorDynamicInclude extends BaseDynamicInclude {

	@Override
	public void include(HttpServletRequest request, HttpServletResponse response, String key) throws IOException {
		Bundle bundle = bundleContext.getBundle();
		
		URL entryURL = bundle.getEntry("META-INF/js/profile_format_btn.js");
		
		StreamUtil.transfer(entryURL.openStream(), response.getOutputStream());
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		dynamicIncludeRegistry.register("com.liferay.frontend.editor.ckeditor.web" + "#ckeditor#onEditorCreate");
	}
	
	@Activate
	protected void activate(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
	
	private BundleContext bundleContext;
}
