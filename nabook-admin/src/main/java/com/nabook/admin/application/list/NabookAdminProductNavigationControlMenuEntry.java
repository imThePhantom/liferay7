package com.nabook.admin.application.list;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.PortletModeException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowStateException;
import javax.servlet.http.HttpServletRequest;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.product.navigation.control.menu.BaseProductNavigationControlMenuEntry;
import com.liferay.product.navigation.control.menu.ProductNavigationControlMenuEntry;
import com.liferay.product.navigation.control.menu.constants.ProductNavigationControlMenuCategoryKeys;
import com.nabook.util.WebKeys;

@Component(immediate = true, property = {
		"product.navigation.control.menu.category.key=" + ProductNavigationControlMenuCategoryKeys.TOOLS,
		"product.navigation.control.menu.category.order:Integer=300" }, service = ProductNavigationControlMenuEntry.class)
public class NabookAdminProductNavigationControlMenuEntry extends BaseProductNavigationControlMenuEntry {

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle("content.Language", locale, getClass());
		return LanguageUtil.get(resourceBundle, "icon.home");
	}

	@Override
	public String getURL(HttpServletRequest request){
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL renderURL = PortletURLFactoryUtil.create(request, themeDisplay.getPortletDisplay().getId(),
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		renderURL.setParameter("mvcPath", "/bookstore/view.jsp");
		
		try {
			renderURL.setWindowState(LiferayWindowState.MAXIMIZED);
			renderURL.setPortletMode(LiferayPortletMode.VIEW);
		} catch (PortletModeException e) {
			e.printStackTrace();
		} catch (WindowStateException e) {
			e.printStackTrace();
		}
		return renderURL.toString();
	}

	@Override
	public String getIcon(HttpServletRequest request) {
		return "home";
	}

	@Override
	public String getMarkupView(HttpServletRequest request) {
		return "lexicon";
	}
	
	@Override
	public boolean isShow(HttpServletRequest request) throws PortalException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Layout layout = themeDisplay.getLayout();
		
		if (layout.isTypeControlPanel()) {
			return true;
		}
		return false;
	}
}
