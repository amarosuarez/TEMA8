package boletin01.ej04;

public class StockException extends Exception {

	@Override
	public String getMessage() {
		return "Stock negativo";
	}
	
}
