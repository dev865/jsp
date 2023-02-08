package action.emp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import service.EmpService;
import service.EmpServiceImpl;
public class RemoveAction implements Action {
	private static Logger log = LoggerFactory.getLogger(RemoveAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		EmpService esv = new EmpServiceImpl();
		int isUp = esv.remove(Integer.parseInt(req.getParameter("empno")));
	}
}
