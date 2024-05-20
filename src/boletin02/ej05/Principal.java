package boletin02.ej05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variable donde se almacenará el nombre del usuario
		String nombre = "";
		
		// Variable donde se almacenará la edad del usuario
		int edad;
		
		// Variable de escape
		char escape = 's';
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter in = null;
		
		try {
			in = new BufferedWriter(new FileWriter("src/boletin02/ej05/usuarios.txt", true));
			
			do {
				// Le pedimos los datos al usuario
				System.out.println("Escribe el nombre del usuario");
				nombre = sc.nextLine();
				
				System.out.println("Escribe la edad del usuario");
				edad = sc.nextInt();
				
				// Limpiamos el Scanner
				sc.nextLine();
				
				// Escribimos en el fichero
				in.write(nombre + " " + edad);
				in.newLine();
				
				// Le preguntamos si desea salir
				System.out.println("¿Desea salir? (S para salir, cualquier otra para continuar)");
				escape = sc.nextLine().toLowerCase().charAt(0);
				
			} while (escape != 's');
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Cerramos el Scanner
			sc.close();
			
			try {
				in.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}
	
}
