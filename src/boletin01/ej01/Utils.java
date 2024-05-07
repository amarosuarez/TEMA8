package boletin01.ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que almacena los métodos para leer un double y un entero
 * 
 * @author Amaro Suárez
 */
public class Utils {

	/**
	 * Función que lee el double y devuelve su valor
	 * 
	 * @param sc Scanner
	 * @return Devuelve el valor leído como double
	 */
	public static double readDouble(Scanner sc) {
		// Variable que almacena el double
		double result;
		
		// Manejamos la excepción
		try {
			// Leemos el double
			System.out.println("Escribe un doble");
			result = sc.nextDouble();
		} catch(InputMismatchException e) {
			// Indicamos que el valor no es permitido e inicializamos la variable
			System.out.println("El valor introducido no es de tipo double");
			result = 0;
		}
		
		// Devolvemos el double
		return result;
	}
	
	/**
	 * Función que lee el int y devuelve su valor
	 * 
	 * @param sc Scanner
	 * @return Devuelve el valor leído como int
	 */
	public static int readInt(Scanner sc) {
		// Variable que almacena el int
		int result;
		
		// Manejamos la excepción
		try {
			// Leemos el int
			System.out.println("Escribe un int");
			result = sc.nextInt();
		} catch(InputMismatchException e) {
			// Indicamos que el valor no es permitido e inicializamos la variable
			System.out.println("El valor introducido no es de tipo int");
			result = 0;
		}
		
		return result;
	}
	
}
