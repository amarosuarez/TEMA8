package boletin02.ej07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import boletin02.ej07.objetos.Contacto;

public class LecturaEscrituraArchivo {

	/**
	 * Función que lee el archivo y vuelca los datos en el array
	 */
	public static void leerArchivo() {
		// Variable contador
		int contador = 0;
		
		// Variable que almacena la línea
		String l = "";
		
		// Objecto Contacto
		Contacto contacto;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/boletin02/ej07/archivo/agenda.txt"));
			
			while ((l = reader.readLine()) != null) {
				String[] data = l.split(":");
				
				contacto = new Contacto(data[0], data[1]);
				
				// Añadimos al array
				ArrayAgenda.arrayContacto[contador] = contacto;
				
				contador++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// NO existe el archivo
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void escribirArchivo() {
		
		BufferedWriter in = null;
		
		try {
			in = new BufferedWriter(new FileWriter("src/boletin02/ej07/archivo/agenda.txt"));
			
			// Recorremos todos por si hay posiciones nulas entre medio
			for (Contacto contacto : ArrayAgenda.arrayContacto) {
				// Comprobamos que no sea nulo
				if (contacto != null) {
					in.write(contacto.getNombre()+":"+contacto.getTelefono());
					in.newLine();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
