package boletin01.ej02;

public class NegativeMinuteException extends Exception {

	@Override
	public String toString() {
		return "Minutos en negativo";
	}

	@Override
	public String getMessage() {
		return "Minutos en negativo";
	}
	
}
