package boletin01.ej04;

public class PrecioException extends Exception {

	@Override
	public String getMessage() {
		return "Precio negativo";
	}
	
}
