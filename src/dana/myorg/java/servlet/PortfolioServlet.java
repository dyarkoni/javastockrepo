package dana.myorg.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dana.myorg.java.model.Portfolio;
import dana.myorg.java.service.PortfolioManager;



public class PortfolioServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
	throws ServletException,IOException{
		
		resp.setContentType("text/html");
		PortfolioManager portfolioManager = new PortfolioManager();
		resp.getWriter().println(portfolioManager.getPortfolio().getHtmlString());

		
	}
	
}
