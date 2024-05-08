package boletin01.ej04;

import java.util.Scanner;

import boletin01.ej03.CuentaCorriente;

public class Principal {

	public static void main(String[] args) {
		// Variable que almacena el nombre
		String nombre = "";

		// Variable que almacena el precio
		double precio;

		// Variable que almacena el stock
		int stock;
		
		// Creamos un objeto Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un objeto Articulo
		Articulo art;
		
		try {
			System.out.println("Añade un nombre");
			nombre = sc.nextLine();
			
			System.out.println("Añade un precio");
			precio = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Añade un stock");
			stock = sc.nextInt();
			sc.nextLine();
			
			art = new Articulo(nombre, precio, stock);
		} catch (NombreException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (PrecioException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (StockException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
