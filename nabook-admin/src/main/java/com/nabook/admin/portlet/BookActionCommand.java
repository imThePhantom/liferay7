package com.nabook.admin.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nabook.util.NabookConstants;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + NabookConstants.PORTLET_NABOOKADMIN,
		"mvc.command.name=" + NabookConstants.ACTION_BOOK,
	},
	service = MVCActionCommand.class
)
public class BookActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response) throws Exception {
		String cmd = ParamUtil.getString(request, NabookConstants.CMD);
		try {
			if (cmd.equals(NabookConstants.ADD)) {
				addBook(request, response);
			} else if (cmd.equals(NabookConstants.UPDATE)) {
				updateBook(request, response);
			} else if (cmd.equals(NabookConstants.DELETE)) {
				deleteBook(request, response);
			} else if (cmd.equals(NabookConstants.SET_AUTHOR)){
				setAuthor(request, response);
			} else {
				System.out.println("Command not found");
			}
		} catch (Exception e) {
			System.out.println("process Action has exception");
		}
	}

	private void addBook(ActionRequest request, ActionResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	private void deleteBook(ActionRequest request, ActionResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	private void setAuthor(ActionRequest request, ActionResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	private void updateBook(ActionRequest request, ActionResponse response) {
		// TODO Auto-generated method stub
		
	}
	
}
