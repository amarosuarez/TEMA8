package boletin01.ej03;

public class DNIException extends Exception {

	@Override
	public String getMessage() {
		return "DNI mal formado";
	}
	
}
