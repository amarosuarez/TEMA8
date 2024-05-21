package boletin02.ej04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variable donde almacenaremos el texto a escribir
		String linea = "";
		
		int numLinea = 1;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter in = null;
		
		try {
			in = new BufferedWriter(new FileWriter("src\\boletin02\\ej04\\texto.txt"));
			
			do {
				System.out.println("Escribe la línea " + numLinea + " (Para acabar escribe fin)");
				
				linea = sc.nextLine();
				
				in.write(linea);
				in.newLine();
				
				numLinea++;
			} while (!linea.equals("fin"));
			
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
