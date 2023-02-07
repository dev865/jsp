package action.emp;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.EmpVO;
import service.EmpService;
import service.EmpServiceImpl;
public class ListAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ListAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		EmpService esv = new EmpServiceImpl();
		System.out.println();
		List<EmpVO> list = esv.getList();
		req.setAttribute("list", list);
		
	}
}
