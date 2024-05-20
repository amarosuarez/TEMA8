package boletin02.ej07.objetos;

/**
 * Clase que almacena el nombre y teléfono de una persona
 *
 * @author Amaro
 */
public class Contacto {

	/**
	 * Atributo que almacena el nombre
	 */
	private String nombre = "";

	/**
	 * Atributo que almacena el teléfono
	 */
	private String telefono = "";

	/**
	 * Constructor con los parámetros nombre y teléfono
	 * 
	 * @param nombre   Nombre del contaco
	 * @param telefono Telefono del contacto
	 */
	public Contacto(String nombre, String telefono) {
		// Comprobamos que el nombre no sea null ni vacío
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		// Comprobamos que el telefono no sea null ni vacío
		if (telefono != null && !telefono.isEmpty()) {
			this.telefono = telefono;
		}
	}

	/**
	 * Función que obtiene el nombre del contacto
	 * 
	 * @return Devuelve el nombre del contacto
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Función que obtiene el teléfono del contacto
	 * 
	 * @return Devuelve el teléfono del contacto
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * Función que almacena el nombre del contacto
	 * 
	 * @param nombre Nombre del contacto
	 */
	public void setNombre(String nombre) {
		// Comprobamos que el nombre no sea null ni vacío
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Función que almacena el teléfono
	 * 
	 * @param telefono Teléfono del contacto
	 */
	public void setTelefono(String telefono) {
		// Comprobamos que el telefono no sea null ni vacío
		if (telefono != null && !telefono.isEmpty()) {
			this.telefono = telefono;
		}
	}

	/**
	 * Función que obtiene la información del contacto
	 * 
	 * @return Devuelve la información del contacto
	 */
	@Override
	public String toString() {
		// Variable que almacena la información
		String info = "";

		info += "📞📞📞📞📞📞📞📞📞📞📞️️️️️";
		info += "\nNombre: " + this.nombre;
		info += "\nTeléfono: " + this.telefono;

		// Devolvemos la información
		return info;
	}

	/**
	 * Función que comprueba si dos contactos son iguales
	 * 
	 * @return Devuelve si dos contactos son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		// Variable que almacena si son iguales
		boolean iguales = false;

		// Casteamos el objeto
		Contacto contacto = (Contacto) obj;

		// Comprobamos si el nombre y el telefono son iguales
		if (this.nombre.equals(contacto.getNombre())) {
			iguales = true;
		}

		// Devolvemos si son iguales
		return iguales;
	}
}
