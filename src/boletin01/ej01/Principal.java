package boletin01.ej01;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		// Variable donde se guardará el double
		double doble;
		
		// Variable donde se almacenará el int
		int entero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Leemos el double
		doble = Utils.readDouble(sc);
		
		// Limpiamos el Scanner
		sc.nextLine();
		
		// Leemos el int
		entero = Utils.readInt(sc);
		
		// Imprimimos
		System.out.println(doble);
		System.out.println(entero);
		
		// Cerramos el Scanner
		sc.close();
	}

}
