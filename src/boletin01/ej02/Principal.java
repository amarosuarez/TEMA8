package boletin01.ej02;

public class Principal {

	public static void main(String[] args) {
		Hora hora;
		Hora hora2;
		Hora hora3;
		
		try {
			hora = new Hora(-22, 15, 30);
			
			hora.setMinutos(10);
			hora.setHora(5);
			hora.setSegundos(8);
		} catch (NegativeMinuteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeHourException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeSecondException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			hora2 = new Hora(22, 15, 30);
			
			hora2.setMinutos(-10);
			hora2.setHora(5);
			hora2.setSegundos(8);
		} catch (NegativeMinuteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeHourException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeSecondException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			hora3 = new Hora(22, 15, 30);
			
			hora3.setMinutos(10);
			hora3.setHora(5);
			hora3.setSegundos(-8);
		} catch (NegativeMinuteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeHourException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeSecondException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
