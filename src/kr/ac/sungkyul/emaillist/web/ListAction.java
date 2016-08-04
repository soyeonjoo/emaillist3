package kr.ac.sungkyul.emaillist.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sungkyul.emaillist.dao.EmailListDao;
import kr.ac.sungkyul.emaillist.vo.EmailListVo;
import kr.ac.sungkyul.web.Action;
import kr.ac.sungkyul.web.WebUtil;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list =dao.getList();
		
		//request범위(scope)에 list객체를 저장, list불러와서 저장하는것
		request.setAttribute("l", list); //(참조이름-원하는대로 만들기, 객체이름)
			
		WebUtil.forward("/WEB-INF/views/list.jsp", request, response);
	
		
	}

}
