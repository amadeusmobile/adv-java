package net.webservicex;

public class Client {

	public static void main(String[] args) {
		StockQuote service= new StockQuote();
		StockQuoteSoap port=service.getStockQuoteSoap();
		System.out.println(port.getQuote("WFC"));

	}

}
