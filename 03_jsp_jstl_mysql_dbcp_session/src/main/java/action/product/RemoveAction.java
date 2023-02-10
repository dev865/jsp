package action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import service.ProductService;
import service.ProductServiceImpl;

public class RemoveAction implements Action {
	private static Logger log = LoggerFactory.getLogger(RemoveAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		int pno = Integer.parseInt("pno");
		ProductService psv = new ProductServiceImpl();
		int isUp = psv.remove(pno);
		log.info(">>> product romove > {}", isUp > 0 ? "Success" : "Fail");
	}

}
