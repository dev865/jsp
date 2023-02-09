package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import action.product.DetailAction;
import action.product.InsertAction;
import action.product.ListAction;
import action.product.ModifyAction;
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=uft-8");
		
		String uri = req.getRequestURI();
		log.info(">>> uri > {}", uri);
		String context = req.getContextPath();
		log.info(">>> context > {}", context);
		String path = uri.substring(context.length());
		log.info(">>> path > {}", path);
		path = path.substring(path.lastIndexOf("/")+1);
		
		String destPage = "";
		Action action = null;
		
		switch(path) {
		case "register.pd":
			destPage = "/product/register.jsp";
			break;
		case "insert.pd":
			action = new InsertAction();
			action.execute(req, resp);
			destPage = "list.pd";
			break;
		case "list.pd":
			action = new ListAction();
			action.execute(req, resp);
			destPage = "/product/list.jsp";
			break;
		case "detail.pd":
			action = new DetailAction();
			action.execute(req, resp);
			destPage = "/product/detail.jsp";
			break;
		case "modify.pd":
			action = new DetailAction();
			action.execute(req, resp);
			destPage = "/product/modify.jsp";
			break;
		case "update.pd":
			action = new ModifyAction();
			action.execute(req, resp);
			destPage = "detail.pd?pno="+req.getParameter("pno");
		default:
			break;
		}
		RequestDispatcher rdp = req.getRequestDispatcher(destPage);
		rdp.forward(req, resp);
	}
	
}
