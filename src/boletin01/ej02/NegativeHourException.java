package boletin01.ej02;

public class NegativeHourException extends Exception {
	
	@Override
	public String toString() {
		return "Hora negativa";
	}
	
	@Override
	public String getMessage() {
		return "Hora negativa";
	}

}
