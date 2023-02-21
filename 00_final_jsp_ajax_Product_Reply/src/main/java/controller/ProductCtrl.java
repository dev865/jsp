package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.ProductService;
import service.ProductServiceImpl;

@WebServlet("/prd/*")
public class ProductCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductService psv;
	private static final Logger log = LoggerFactory.getLogger(MemberCtrl.class);
	private RequestDispatcher rdp;
	private int isUp;
	private String destPage;
    public ProductCtrl() {
        psv = new ProductServiceImpl();
    }
    
	protected void service(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		
		String uri = req.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/")+1);
		log.info(">>> path : " + path);
		
		switch (path) {
		case "register": 
			destPage="/product/register.jsp";
			break;
		case "insert":
			
			isUp = 
			break;
		default :
			break;
		}
		rdp = req.getRequestDispatcher(destPage);
		rdp.forward(req, res);
	}
	
	
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
