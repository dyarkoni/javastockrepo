package dana.myorg.java.model;
import dana.myorg.java.Stock;

public class Portfolio {
	
		// Class Members
		private String title;
		private final int MAX_PORTFOLIO_SIZE=5;
		private Stock[] stocks;
		private int portfolioSize = 0;
	
		//constructor
		public Portfolio(String portfolioTitle){
			
			title=portfolioTitle;
			stocks=new Stock[MAX_PORTFOLIO_SIZE];
			
		}
		//Method that receives stock and add it to portfolio's stocks array.
		public void addStock (Stock stock){
			stocks[portfolioSize]=stock;
			portfolioSize++;
		}
		//returns the stocks array
		public Stock[] getStocks()
		{
			return stocks;
		}
		
		public String getHtmlString()
		{
			String result;
			result= new String("<h1>" + title + "</h1>");
			for (int i=0; i<portfolioSize; i++)
			{
				result += stocks[i].getHtmlDescription();
				result += "<br>";
				
			}
			return result;
		}
}
