package com.nabook.service.listeners;

import org.osgi.service.component.annotations.Component;

import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetTagLocalServiceUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ServiceContext;
import com.nabook.model.Author;

@Component(immediate = true, service = ModelListener.class)
public class AuthorListener extends BaseModelListener<Author> {
	@Override
	public void onAfterCreate(Author author) throws ModelListenerException {
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(author.getCompanyId());
		AssetTag assetTag = null;
		assetTag = AssetTagLocalServiceUtil.fetchTag(author.getGroupId(), author.getFullName());
		if (assetTag == null) {
			try {
				 assetTag = AssetTagLocalServiceUtil.addTag(author.getUserId(), author.getGroupId(), author.getFullName(),
						serviceContext);
				String[] tagNames = new String[] { assetTag.getName() };
				AssetEntryLocalServiceUtil.updateEntry(author.getUserId(), author.getGroupId(), Author.class.getName(),
						author.getAuthorId(), null, tagNames);
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		super.onAfterCreate(author);
	}
}
