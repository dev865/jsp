package action.emp;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import service.EmpService;
import service.EmpServiceImpl;
public class DeatilAction implements Action {
	private static Logger log = LoggerFactory.getLogger(DeatilAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("evo", 
				new EmpServiceImpl().getDetail(
						Integer.parseInt(req.getParameter("empno"))));
		
//		EmpService esv = new EmpServiceImpl();
//		int empno = Integer.parseInt(req.getParameter("empno"));
//		EmpVO evo = esv.getDetail(empno);
//		req.setAttribute("evo", evo);
// 조금 헷갈리면 밑에 주석처리 한부분보기(모두변수선언)
	}
}