package boletin02.ej01;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		String l = "";
		double suma = 0;
		double media = 0;
		int contador = 0;
		
		// Creamos un objeto FileReader
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\boletin02\\ej01\\numerosReales.txt"));
			
			while ((l = reader.readLine()) != null) {
				String[] array = l.split(" ");
				
				for (String n : array) {
					// Sumamos los números
					suma += Double.parseDouble(n);
					
					// Aumentamos el contador
					contador++;
				}
				
			}
			
			// Calculamos la media
			media = suma/contador;
			
			// Mostramos los datos por pantalla
			System.out.println("Suma: " + suma + " Media: " + media);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
