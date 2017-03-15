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
import com.nabook.model.Book;
import com.nabook.service.AuthorLocalServiceUtil;
import com.nabook.service.BookLocalServiceUtil;

@Component(immediate = true, service = ModelListener.class)
public class BookListener extends BaseModelListener<Book> {

	private AssetTag authorTag;

	@Override
	public void onAfterAddAssociation(Object bookId, String authorClassName, Object authorId)
			throws ModelListenerException {
		Book book = null;
		Author author = null;

		book = BookLocalServiceUtil.fetchBook((long) bookId);
		author = AuthorLocalServiceUtil.fetchAuthor((long) authorId);

		authorTag = AssetTagLocalServiceUtil.fetchTag(book.getBookId(), author.getFullName());
		if (authorTag == null) {
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setCompanyId(author.getCompanyId());
			try {
				authorTag = AssetTagLocalServiceUtil.addTag(author.getUserId(), author.getGroupId(), author.getFullName(),
						serviceContext);
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		String[] tagNames = new String[]{authorTag.getName()};
		try {
			AssetEntryLocalServiceUtil.updateEntry(book.getUserId(), book.getGroupId(), Book.class.getName(),
					book.getBookId(), null, tagNames);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
}
