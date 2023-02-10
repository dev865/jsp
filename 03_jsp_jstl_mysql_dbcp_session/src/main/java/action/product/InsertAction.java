package action.product;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.EmpVO;
import domain.ProdVO;
import service.ProductService;
import service.ProductServiceImpl;
public class InsertAction implements Action {
	private static Logger log = LoggerFactory.getLogger(InsertAction.class);
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		ProductService psv = new ProductServiceImpl();
		int isUp = psv.register(
						new ProdVO(req.getParameter("pname"),
									Integer.parseInt(req.getParameter("price")), 
									req.getParameter("madeby")));
		log.info(">>> Product Register > {}", isUp > 0 ? "Success" : "Fail");
	}
}
