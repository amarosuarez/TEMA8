package boletin02.ej03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variable donde se almacenará la media de edad
		double mediaEdad = 0;
		
		// Variable donde se almacenará la media de estatura
		double mediaEstatura = 0;
		
		// Variable contador que almacenará el número de lineas
		int contador = 0;
		
		// Variable que almacena la línea
		String l = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\boletin02\\ej03\\Alumnos.txt"));

			while ((l = reader.readLine()) != null) {
				String[] array = l.split(" ");
				
				// Mostramos el nombre
				System.out.println(array[0]);
				
				// Sumamos la edad
				mediaEdad += Integer.parseInt(array[1]);
				
				// Sumamos la estatura
				mediaEstatura += Double.parseDouble(array[2]);
				
				contador++;
			}
			
			
			// Calculamos la media de la edad
			mediaEdad /= contador;
			
			// Calculamos la media de la estatura
			mediaEstatura /= contador;
			
			// Mostramos los resultados
			System.out.println("Media edad: " + mediaEdad);
			System.out.println("Media estatura: " + mediaEstatura);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
}
