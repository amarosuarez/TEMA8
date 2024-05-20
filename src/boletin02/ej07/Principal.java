package boletin02.ej07;

import java.util.Scanner;

import boletin02.ej07.objetos.Contacto;

public class Principal {

	public static void main(String[] args) {
		// Variable que almacena la opción elegida
		int opcion;

		// Leemos el archivo
		LecturaEscrituraArchivo.leerArchivo();

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		do {

			// Mostramos el menú
			menu();

			// Leemos la opción
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1: // Nuevo contacto
				nuevoContacto(sc);
				break;
			case 2: // Buscar por nombre
				buscar(sc);
				break;
			case 3: // Muestra todos
				ArrayAgenda.mostrarTodos();
				break;
			case 4: // Salir
				LecturaEscrituraArchivo.escribirArchivo();
				break;
			}

		} while (opcion != 4);

		System.out.println("Hasta luego!");
		
		// Cerramos el Scanner
		sc.close();
	}

	public static void menu() {
		System.out.println("\t\tMenú");
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Buscar por nombre");
		System.out.println("3. Mostrar todos");
		System.out.println("4. Salir");
	}

	public static void buscar(Scanner sc) {
		// Variable que almacena el indice
		int index;

		// Variable que almacena el nombre
		String nombre = "";

		// Le preguntamos por el nombre
		System.out.println("Escribe el nombre");
		nombre = sc.nextLine();

		index = ArrayAgenda.buscaContactoNombre(nombre);

		if (index > -1) {
			System.out.println(ArrayAgenda.arrayContacto[index]);
		} else {
			System.out.println("No se ha encontrado ningún contacto con el nombre " + nombre);
		}
	}

	public static void nuevoContacto(Scanner sc) {
		// Variable que almacena el nombre
		String nombre = "";

		// Variable que almacena el teléfono
		String telefono = "";
		
		// Le preguntamos por el nombre
		System.out.println("Escribe el nombre");
		nombre = sc.nextLine();

		// Le preguntamos por el teléfono
		System.out.println("Escribe el teléfono");
		telefono = sc.nextLine();

		Contacto contacto = new Contacto(nombre, telefono);

		if (ArrayAgenda.anyadirContacto(contacto)) {
			System.out.println("¡Añadido!");
		} else {
			System.out.println("No se ha podido añadir");
		}
	}

}
