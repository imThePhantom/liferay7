package com.nabook.service.indexer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelperUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nabook.model.Book;
import com.nabook.service.BookLocalServiceUtil;
import com.nabook.util.NabookConstants;

@Component(service = Indexer.class)
public class BookIndexer extends BaseIndexer<Book> {
	public static final String CLASS_NAME = Book.class.getName();
	public static final String PORTLET_ID = NabookConstants.PORTLET_NABOOKADMIN;
	
	public BookIndexer() {
		setPermissionAware(true);
	}
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	protected void doDelete(Book book) throws Exception {
		Document document = getDocument(book);
		IndexWriterHelperUtil.deleteDocument(getSearchEngineId(), book.getCompanyId(), document.getUID(), true);
		System.out.println("doDelete for " + book.getTitle() + " in indexer invoked");
	}

	@Override
	protected Document doGetDocument(Book book) throws Exception {
		Document document = getBaseModelDocument(PORTLET_ID, book);
		document.addUID(Field.UID, book.getUuid());
		document.addKeyword(SearchField.BOOK_ISBN, book.getISBN());
		document.addText(SearchField.BOOK_TITLE, book.getTitle() + " : " + book.getSubtitle());
		document.addText(SearchField.BOOK_PUBLISHER, book.getPublisher());
		
		System.out.println("doGetDocument for " + book.getTitle() + " in indexer invoked");
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		Summary summary = createSummary(document);
		return summary;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Book book = BookLocalServiceUtil.getBook(classPK);
		doReindex(book);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		List<Book> books = null;
		for (int i = 0, size = ids.length; i < size; i++) {
			long companyId = GetterUtil.getLong(ids[i]);
			books = BookLocalServiceUtil.getAllBooks();
			for (Book book : books) {
				Document document = getDocument(book);
				IndexWriterHelperUtil.updateDocument(getSearchEngineId(), companyId, document, true);
				System.out.println("Reindex " + book.getTitle());
			}
		}
	}

	@Override
	protected void doReindex(Book book) throws Exception {
		Document document = getDocument(book);
		IndexWriterHelperUtil.updateDocument(getSearchEngineId(), book.getCompanyId(), document, true);
		System.out.println("Reindex " + book.getTitle());
	}
	
	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, SearchContext searchContext) throws Exception {
		addSearchTerm(searchQuery, searchContext, SearchField.BOOK_ISBN, true);
		addSearchTerm(searchQuery, searchContext, SearchField.BOOK_TITLE, true);
		addSearchTerm(searchQuery, searchContext, SearchField.BOOK_PUBLISHER, true);

		LinkedHashMap<String, Object> params = (LinkedHashMap<String, Object>) searchContext.getAttribute("params");
		if (params != null) {
			String expandoAttributes = (String) params.get("expandoAttributes");
			if (Validator.isNotNull(expandoAttributes)) {
				addSearchExpando(searchQuery, searchContext, expandoAttributes);
			}
		}
	}
}
