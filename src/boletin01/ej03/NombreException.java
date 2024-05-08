package boletin01.ej03;

public class NombreException extends Exception {

	@Override
	public String getMessage() {
		return "Nombre mal formado";
	}
	
}
