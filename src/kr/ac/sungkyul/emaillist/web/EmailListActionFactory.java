package kr.ac.sungkyul.emaillist.web;

import kr.ac.sungkyul.web.AbstractActionFactory;
import kr.ac.sungkyul.web.Action;

public class EmailListActionFactory extends AbstractActionFactory {

	@Override
	public Action getAction(String actionName) {
	
		Action action = null;
		
		if("form".equals(actionName)){
			action = new FormAction();
		}
		else if( "insert".equals(actionName)){
			action = new InsertAction();
			
		}else {
			action =new ListAction();
		}
		return action;
	}

}
