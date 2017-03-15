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
import com.nabook.model.Author;
import com.nabook.service.AuthorLocalServiceUtil;
import com.nabook.util.NabookConstants;

@Component(service = Indexer.class)
public class AuthorIndexer extends BaseIndexer<Author> {
	public static final String CLASS_NAME = Author.class.getName();
	public static final String PORTLET_ID = NabookConstants.PORTLET_NABOOKADMIN;

	public AuthorIndexer() {
		setPermissionAware(true);
	}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	protected void doDelete(Author author) throws Exception {
		Document document = getDocument(author);
		IndexWriterHelperUtil.deleteDocument(getSearchEngineId(), author.getCompanyId(), document.getUID(), true);
	}

	@Override
	protected Document doGetDocument(Author author) throws Exception {
		Document document = getBaseModelDocument(PORTLET_ID, author);
		document.addUID(Field.UID, author.getUuid());
		document.addText(SearchField.AUTHOR_NAME, author.getFullName());
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
		Author author = AuthorLocalServiceUtil.getAuthor(classPK);
		doReindex(author);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		List<Author> authors = null;
		for (int i = 0, size = ids.length; i < size; i++) {
			long companyId = GetterUtil.getLong(ids[i]);
			authors = AuthorLocalServiceUtil.getAllAuthors();
			for (Author author : authors) {
				Document document = getDocument(author);
				IndexWriterHelperUtil.updateDocument(getSearchEngineId(), companyId, document, true);
			}
		}
	}

	@Override
	protected void doReindex(Author author) throws Exception {
		Document document = getDocument(author);
		IndexWriterHelperUtil.updateDocument(getSearchEngineId(), author.getCompanyId(), document, true);
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, SearchContext searchContext) throws Exception {
		addSearchTerm(searchQuery, searchContext, SearchField.AUTHOR_NAME, true);

		LinkedHashMap<String, Object> params = (LinkedHashMap<String, Object>) searchContext.getAttribute("params");
		if (params != null) {
			String expandoAttributes = (String) params.get("expandoAttributes");
			if (Validator.isNotNull(expandoAttributes)) {
				addSearchExpando(searchQuery, searchContext, expandoAttributes);
			}
		}
	}
}
