package boletin01.ej02;

public class Principal {

	public static void main(String[] args) {
		Hora hora;
		try {
			hora = new Hora(-22, 15, 30);
			hora.setMinutos(10);
			hora.setHora(5);
			hora.setSegundos(8);

			System.out.println(hora);

		} catch (NegativeMinuteException | NegativeHourException | NegativeSecondException e) {
			System.out.println(e.getMessage());
					
			// e.printStackTrace();
		}
	}
	
}
