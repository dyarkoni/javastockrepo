package dana.myorg.java;

import java.util.Calendar; 
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockDetailsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException,IOException{

		resp.setContentType("text/html");

		//java.util.Date class is deprecated and replaced by calendar class.
		Calendar calendar = Calendar.getInstance();
		calendar.set(2014, Calendar.NOVEMBER, 15);

		//3 instances of stock class
		Stock PIH = new Stock("PIH", 13.1f, 12.4f, calendar.getTime());
		Stock AAL = new Stock("AAL", 5.78f, 5.5f, calendar.getTime());
		Stock CAAS = new Stock("CAAS", 32.2f, 31.5f, calendar.getTime());

		String resultStr;
		resultStr = PIH.getHtmlDescription() + "<br>" + AAL.getHtmlDescription() + "<br>" + CAAS.getHtmlDescription();

		resp.getWriter().println(resultStr);





	}

}
