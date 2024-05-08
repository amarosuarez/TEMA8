package boletin01.ej03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable que almacena el nombre
		String nombre = "";
		
		// Variable que almacena el dni
		String dni = "";
		
		// Variable que almacena el saldo inicial
		double saldo;
		
		// Creamos un objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos un objeto Cuenta corriente
		CuentaCorriente cc;
		
		try {
			System.out.println("Añade un nombre");
			nombre = sc.nextLine();
			
			System.out.println("Añade un dni");
			dni = sc.nextLine();
			
			System.out.println("Añade un saldo inicial");
			saldo = sc.nextDouble();
			
			sc.nextLine();
			cc = new CuentaCorriente(dni, nombre, saldo);
			
		} catch (NombreException e) {
			System.out.println(e.getMessage());
		} catch (DNIException e) {
			System.out.println(e.getMessage());
		} catch (SaldoException e) {
			System.out.println(e.getMessage());
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
