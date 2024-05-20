package boletin02.ej08.objetos;

/**
 * Clase que almacena los métodos de un registro de temperatura
 * 
 * @author Amaro
 */
public class Registro {

	/**
	 * Atributo que almacena la fecha
	 */
	private String fecha = "";
	
	/**
	 * Atributo que almacena la temperatura máxima
	 */
	private double tempMax;
	
	/**
	 * Atributo que almacena la temperatura mínima
	 */
	private double tempMin;
	
	/**
	 * Constructor con parámetros
	 * 
	 * @param fecha Fecha del registro
	 * @param tempMax Temperatura máxima
	 * @param tempMin Temperatura mínima
	 */
	public Registro(String fecha, double tempMax, double tempMin) {
		// Comprobamos que la fecha no sea null ni vacía
		if (fecha != null && !fecha.isEmpty()) {
			this.fecha = fecha;
		}
		
		this.tempMax = tempMax;
		
		this.tempMin = tempMin;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public double getTempMax() {
		return this.tempMax;
	}
	
	public double getTempMin() {
		return this.tempMin;
	}
	
	@Override
	public String toString() {
		String info = "";
		
		info += "🌡️🌡️🌡️🌡️🌡️🌡️";
		info += "\nFecha: " + this.fecha;
		info += "\nMáximo: " + this.tempMax;
		info += "\nMínima: " + this.tempMin;
		
		return info;
	}
}
