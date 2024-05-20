package boletin02.ej08;

import java.util.List;
import java.util.Scanner;

import boletin02.ej07.LecturaEscrituraArchivo;
import boletin02.ej08.objetos.Registro;

public class Principal {

	static Scanner sc;
	
	public static void main(String[] args) {
		
		// Variable que almacena la opción elegida
		int opcion;
		
		sc = new Scanner(System.in);
		
		do {
			menu();
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: // Nueva temperatura
				nuevaTemperatura(sc);
				break;
			case 2: // Muestra historial
				muestraRegistro();
				break;
			case 3: // Salir
				System.out.println("Hasta luego!");
				break;
			}
			
		} while (opcion != 3);
		
	}
	
	public static void muestraRegistro() {
		double max;
		double min;
		
		List<Registro> list = EscrituraArchivo.lectura();
		
		if (list.size() > 0) {
			max = list.get(0).getTempMax();
			min = list.get(0).getTempMin();
			
			for (Registro reg : list) {
				System.out.println(reg);
				
				if (reg.getTempMax() > max) {
					max = reg.getTempMax();
				}
				
				if (reg.getTempMin() < min) {
					min = reg.getTempMin();
				}
			}
			
			System.out.println("-------DATOS-------");
			System.out.println("Mínima: " + min);
			System.out.println("Máxima: " + max);
		}
		
	}
	
	public static void nuevaTemperatura(Scanner sc) {
		double min;
		double max;
		int anyo;
		int mes;
		int dia;
		String fecha = "";
		
		System.out.println("Introduce el año");
		anyo = sc.nextInt();
		
		System.out.println("Introduce el mes");
		mes = sc.nextInt();
		
		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		
		fecha = anyo + "-" + (mes < 10 ? "0" : "") + mes + "-" + (dia < 10 ? "0" : "") + dia;
		
		System.out.println("Añade la temperatura mínima");
		min = sc.nextDouble();
		
		System.out.println("Añade la temperatura máxima");
		max = sc.nextDouble();
		
		Registro registro = new Registro(fecha, max, min);
		
		if (EscrituraArchivo.escritura(registro)) {
			System.out.println("Añadido");
		} else {
			System.out.println("No se pudo añadir");
		}
	}
	
	public static void menu() {
		System.out.println("\t\tMENÚ");
		System.out.println("1. Registra nueva temperatura");
		System.out.println("2. Mostrar historial de registros");
		System.out.println("3. Salir");
	}
}
