package boletin02.ej08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import boletin02.ej08.objetos.Registro;

public class EscrituraArchivo {

	public static boolean escritura(Registro reg) {
		boolean escrito = false;
		
		BufferedWriter in = null;

		try {
			in = new BufferedWriter(new FileWriter("src\\boletin02\\ej08\\archivo\\registros.txt", true));

			String fecha = reg.getFecha();
			String max = reg.getTempMax() + "";
			String min = reg.getTempMin() + "";

			in.write(fecha + "," + max + "," + min);
			in.newLine();
			
			escrito = true;

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
		
		return escrito;
	}

	public static List<Registro> lectura() {
		List<Registro> list = new LinkedList<>();

		// Variable que almacena la línea
		String l = "";

		Registro reg;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\boletin02\\ej08\\archivo\\registros.txt"));

			while ((l = reader.readLine()) != null) {
				String[] data = l.split(",");
				
				reg = new Registro(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
				
				list.add(reg);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// No se ha encontrado el archivo
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
