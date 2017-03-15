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
import com.nabook.model.Bookstore;
import com.nabook.service.BookstoreLocalServiceUtil;
import com.nabook.util.NabookConstants;

@Component(service = Indexer.class)
public class BookstoreIndexer extends BaseIndexer<Bookstore> {
	public static final String CLASS_NAME = Bookstore.class.getName();
	public static final String PORTLET_ID = NabookConstants.PORTLET_NABOOKADMIN;

	public BookstoreIndexer() {
		setPermissionAware(true);
	}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	protected void doDelete(Bookstore bookstore) throws Exception {
		Document document = getDocument(bookstore);
		IndexWriterHelperUtil.deleteDocument(getSearchEngineId(), bookstore.getCompanyId(), document.getUID(), true);
		System.out.println("doDelete for " + bookstore.getName() + " in indexer invoked");
	}

	@Override
	protected Document doGetDocument(Bookstore bookstore) throws Exception {
		String address = bookstore.getCountry() + ", " + bookstore.getCity() + ", " + bookstore.getPrefecture() + ", "
				+ bookstore.getStreet();

		Document document = getBaseModelDocument(PORTLET_ID, bookstore);
		document.addUID(Field.UID, bookstore.getUuid());
		document.addKeyword(Field.ENTRY_CLASS_PK, bookstore.getBookstoreId());
		document.addKeyword(SearchField.BOOKSTORE_ZIPCODE, bookstore.getZip());
		document.addKeyword(SearchField.BOOKSTORE_PHONE, bookstore.getPhone());

		document.addText(SearchField.BOOKSTORE_NAME, bookstore.getName());
		document.addText(SearchField.BOOKSTORE_ADDRESS, address);

		System.out.println("doGetDocument for " + bookstore.getName() + " in indexer invoked");
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
		Bookstore bookstore = BookstoreLocalServiceUtil.getBookstore(classPK);
		doReindex(bookstore);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		List<Bookstore> bookstores = null;
		for (int i = 0, size = ids.length; i < size; i++) {
			long companyId = GetterUtil.getLong(ids[i]);
			bookstores = BookstoreLocalServiceUtil.getAllBookstores();
			for (Bookstore bookstore : bookstores) {
				Document document = getDocument(bookstore);
				IndexWriterHelperUtil.updateDocument(getSearchEngineId(), companyId, document, true);
				System.out.println("Reindex " + bookstore.getName());
			}
		}
	}

	@Override
	protected void doReindex(Bookstore bookstore) throws Exception {
		Document document = getDocument(bookstore);
		IndexWriterHelperUtil.updateDocument(getSearchEngineId(), bookstore.getCompanyId(), document, true);
		System.out.println("Reindex " + bookstore.getName());
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, SearchContext searchContext) throws Exception {
		addSearchTerm(searchQuery, searchContext, SearchField.BOOKSTORE_NAME, true);
		addSearchTerm(searchQuery, searchContext, SearchField.BOOKSTORE_ADDRESS, true);
		addSearchTerm(searchQuery, searchContext, SearchField.BOOKSTORE_ZIPCODE, true);
		addSearchTerm(searchQuery, searchContext, SearchField.BOOKSTORE_PHONE, true);

		LinkedHashMap<String, Object> params = (LinkedHashMap<String, Object>) searchContext.getAttribute("params");
		if (params != null) {
			String expandoAttributes = (String) params.get("expandoAttributes");
			if (Validator.isNotNull(expandoAttributes)) {
				addSearchExpando(searchQuery, searchContext, expandoAttributes);
			}
		}
	}
}
