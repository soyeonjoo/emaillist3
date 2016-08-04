package kr.ac.sungkyul.emaillist.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sungkyul.emaillist.dao.EmailListDao;
import kr.ac.sungkyul.emaillist.vo.EmailListVo;
import kr.ac.sungkyul.web.Action;
import kr.ac.sungkyul.web.WebUtil;

public class InsertAction implements Action {
	
	
	
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String firstName = request.getParameter("fn");
	String lastName = request.getParameter("ln");
	String email = request.getParameter("email");

	EmailListDao dao = new EmailListDao();
	EmailListVo vo = new EmailListVo();

	vo.setFirstName(firstName);
	vo.setLastName(lastName);
	vo.setEmail(email);

	dao.insert(vo);

	WebUtil.redirect("/emaillist3/el", request, response); //다시갔는데 액션이 없기때문에 디폴트 엑션 , 미리 디폴트액션을 리스트로 지정해놓아서 출력
		
	}
}
