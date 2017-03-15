package com.nabook.service.workflow;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.nabook.model.Book;

@Component(
	property = {
		"model.class.name=com.nabook.model.Book"
	},
	service = WorkflowHandler.class
)
public class BookWorkflowHandler extends BaseWorkflowHandler<Book> {

	@Override
	public String getClassName() {
		return "com.nabook.model.Book";
	}

	@Override
	public String getType(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

}
