package dana.myorg.java.service;

import java.util.Calendar;

import dana.myorg.java.Stock;
import dana.myorg.java.model.Portfolio;

public class PortfolioManager {
	
	private Portfolio portfolio;

	
	public PortfolioManager() { // c'tor   
		portfolio = new Portfolio("Dana portfolio");
	}
	
	public Portfolio getPortfolio(){
		
		Calendar calendar = Calendar.getInstance();
	    calendar.set(2014, Calendar.NOVEMBER, 15);

	
	    portfolio.addStock(new Stock("PIH", 13.1f, 12.4f, calendar.getTime()));
	    portfolio.addStock(new Stock("AAL", 5.78f, 5.5f, calendar.getTime()));
	    portfolio.addStock(new Stock("CAAS", 32.2f, 31.5f, calendar.getTime()));
	    
		return portfolio;
		
	}
	
	
	
}
