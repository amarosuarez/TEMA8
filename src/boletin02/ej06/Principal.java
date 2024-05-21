package boletin02.ej06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Lista donde se almacenarán los números
		List<Integer> listaNumeros = new LinkedList<>();
		
		// Variable donde se almacenará el número
		int numero;
		
		// Creamos el Scanner
		Scanner sc = null;
		
		BufferedWriter in = null;
		
		try {
			sc = new Scanner(new FileReader("src\\boletin02\\ej06\\numerosDesordenados.txt"));
			
			// Ejecutamos mientras haya números
			while (sc.hasNextInt()) {
				// Leemos el número
				numero = sc.nextInt();
				
				// Lo añadimos a la lista
				listaNumeros.add(numero);
			}
			
			// Ordenamos la lista
			Collections.sort(listaNumeros);
			
			// Escribimos la lista en un nuevo archivo
			in = new BufferedWriter(new FileWriter("src\\boletin02\\ej06\\numerosOrdenados.txt"));
			
			for (int num : listaNumeros) {
				in.write(String.valueOf(num));
				in.newLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
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
		
		System.out.println("Números ordenados");
		
	}
	
}
