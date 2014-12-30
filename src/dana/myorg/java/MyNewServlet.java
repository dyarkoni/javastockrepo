package dana.myorg.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyNewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
		
		int radius=50;
		int angleB=30;
		int exp=13;
		int base=20;
		int hypotenuse=50;
		double opposite= (Math.sin(Math.toRadians(angleB)))*hypotenuse;
		double circleArea= Math.PI * Math.pow(radius,2);
		double pow=Math.pow(base, exp);
		
		String line1 = new String("<h2 style=color:green><u>calculation 1</u>: Area of circle with radius "+radius+" is "+circleArea+ " square-cm. "+"</h2>");
		String line2 = new String("<h2 style=color:orange><u> calculation 2</u>: Length of opposite where angle B is " + angleB +	" degrees and Hypotenuse length is "+ hypotenuse+" cm is: "+ opposite+" cm. "+"</h2>");
		String line3 = new String("<h2 style=color:blue><u> calculation 3</u>: Power of "+ base + " with exp of " +exp+" is " + pow+"</h2>");
		String resultStr = line1 + "<br>" + line2 + "<br>" +line3;
		resp.getWriter().println(resultStr);
		
	}

}
