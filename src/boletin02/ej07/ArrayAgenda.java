package boletin02.ej07;

import boletin02.ej07.objetos.Contacto;

/**
 * Clase que contiene los métodos para controlar un array de contactos
 * 
 * @author Amaro
 */
public class ArrayAgenda {

	/**
	 * Atributo que almacena un array de contactos
	 */
	static Contacto[] arrayContacto = new Contacto[20];
	
	/**
	 * Función que muestra todos los contactos que no sean nulos
	 */
	public static void mostrarTodos() {
		// Mostramos los que no sean nulos
		for (Contacto contacto : arrayContacto) {
			if (contacto != null) {
				System.out.println(contacto);
			}
		}
	}

	/**
	 * Función que añade un contacto y devuelve si ha sido posible
	 * 
	 * @param contacto Contacto a añadir
	 * @return Devuelve si ha sido posible añadir al contacto
	 */
	public static boolean anyadirContacto(Contacto contacto) {
		// Variable que almacena si se ha añadido el usuario
		boolean anyadido = false;

		// Variable que almacena el indice disponible
		int index = 0;

		// Comprobamos si hay una posición vacía
		index = indexVacio();

		if (index > -1) {

			// Comprobamos que no haya un contacto igual en el array
			if (!buscaContactoIgual(contacto)) {
				// Añadimos el contacto en el array
				arrayContacto[index] = contacto;
				anyadido = true;
			}

		}

		// Devolvemos si se ha añadido el usuario
		return anyadido;
	}

	/**
	 * Función que busca un contacto por su nombre
	 * 
	 * @param nombre Nombre a buscar
	 * @return Devuelve el indice del contacto
	 */
	public static int buscaContactoNombre(String nombre) {
		// Variable que almacena si se ha encontrado un contacto igual al proporcionado
		boolean encontrado = false;
		
		int pos = -1;

		// Variable que almacena el índice
		int index = 0;

		while (index < arrayContacto.length && !encontrado) {
			if (arrayContacto[index] != null && arrayContacto[index].getNombre().equalsIgnoreCase(nombre)) {
				pos = index;
				encontrado = true;
			}
			
			index++;
		}
		
		return pos;
	}

	/**
	 * Función que busca un contacto igual al proporcionado
	 * 
	 * @param contacto Contacto a buscar en el array
	 * @return Devuelve si se ha encontrado un contacto igual en el array
	 */
	public static boolean buscaContactoIgual(Contacto contacto) {
		// Variable que almacena si se ha encontrado un contacto igual al proporcionado
		boolean encontrado = false;

		// Variable que almacena el índice
		int index = 0;

		while (index < arrayContacto.length && !encontrado) {
			if (arrayContacto[index] != null && arrayContacto[index].equals(contacto)) {
				encontrado = true;
			}

			index++;
		}

		// Devuelve si se ha encontrado un contacto igual
		return encontrado;
	}

	/**
	 * Funciónq ue busca una posición nula en el array y devuelve el índice de esta
	 * o -1 en caso de que no haya
	 * 
	 * @return Devuelve el índice de la posición vacía o -1 en caso de que no haya
	 */
	public static int indexVacio() {
		// Variable que almacena el indice de la posición vacía
		int pos = -1;

		// Variable que almacena el índice
		int index = 0;

		// Variable que almacena si se ha encontrado una posición vacía
		boolean encontrado = false;

		// Buscamos una posición vacía
		while (index < arrayContacto.length && !encontrado) {
			if (arrayContacto[index] == null) {
				pos = index;
				encontrado = true;
			}

			index++;
		}

		// Devolvemos el índice
		return pos;
	}
}
