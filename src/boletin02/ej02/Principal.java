package boletin02.ej02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variable donde se almacenará la suma
		int suma = 0;
		
		// Variable donde se almacenará la media
		double media = 0;
		
		// Contador que almacena el total de números que hay en el fichero
		int contador = 0;
		
		// Creamos el Scanner
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("src/boletin02/ej02/Enteros.txt"));
						
			// Ejecutamos mientras siga habiendo un número
			while (sc.hasNextInt()) {
				suma += sc.nextInt();
				
				contador++;
			}
			
			// Calculamos la media
			if (contador > 0) {				
				media = (double) suma / contador;
			}
			
			// Mostramos la media y la suma
			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Cerramos el Scanner
			sc.close();
		}
	}
	
}
