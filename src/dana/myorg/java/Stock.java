package dana.myorg.java;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Stock {

	// Class Members
	private String symbol;
	private float ask;
	private float bid;
	private Date date;


	//parameterized constructor
	public Stock(String p_symbol, float p_ask, float p_bid, Date p_date){
		this.ask = p_ask;
		this.bid = p_bid;
		this.symbol = p_symbol;
		this.date = p_date;
	}

	//Method that returns a string with stock’s details
	public String getHtmlDescription(){

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		String stockHtmlDetailsString = "<u><b>Stock symbol:</b></u> " +getSymbol()+ " <u><b>Bid:</b></u> " +getBid() + " <u><b>ask:</b></u> " + getAsk() + " <u><b>date:</b></u> "+ dateFormat.format(getDate());

		return stockHtmlDetailsString;
	}


	//Getters and Setters
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getAsk() {
		return ask;
	}
	public void setAsk(float ask) {
		this.ask = ask;
	}
	public float getBid() {
		return bid;
	}
	public void setBid(float bid) {
		this.bid = bid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}










}
