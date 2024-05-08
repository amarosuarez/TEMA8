package boletin01.ej03;

public class SaldoException extends Exception {

	@Override
	public String getMessage() {
		return "Saldo negativo";
	}
	
}
