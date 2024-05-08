package boletin01.ej02;

/**
 * Clase Hora que contiene los atributos y funciones de una hora
 * 
 * @author Amaro
 */
public class Hora {

	/**
	 * Atributo que almacena la hora
	 */
	protected int hora;

	/**
	 * Atributo que almacena los minutos
	 */
	protected int minutos;

	/**
	 * Atributo que almacena los segundos
	 */
	protected int segundos;

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora     Hora introducida
	 * @param minutos  Minuto introducidos
	 * @param segundos Segundos inntroducidos
	 */
	public Hora(int hora, int minutos, int segundos)
			throws NegativeMinuteException, NegativeHourException, NegativeSecondException {
		if (hora >= 0) {
			// Comprobamos que la hora sea menor o igual que 23
			if (hora <= 23) {
				// Cambiamos el valor de la hora
				this.hora = hora;
			}
		} else {
			throw new NegativeHourException();
		}

		if (minutos >= 0) {
			// Comprobamos que los minutos sean menor o igual que 59
			if (minutos <= 59) {
				this.minutos = minutos;
			}
		} else {
			throw new NegativeMinuteException();
		}

		if (segundos >= 0) {
			// Comprobamos que los segundos sean menor o igual que 59
			if (segundos <= 59) {
				this.segundos = segundos;
			}
		} else {
			throw new NegativeSecondException();
		}
	}

	/**
	 * Función que incrementa la hora en un minuto
	 */
	void inc() {
		// Aumentamos en uno los minutos
		this.minutos++;

		// Comprobamos que los minutos no sean mayor que 59
		if (this.minutos == 60) {
			// En este caso le ponemos 0 como valor a los minutos e incrementamos una hora
			this.minutos = 0;

			// Sumamos uno a la hora
			this.hora++;

			// Comprobamos que la hora no sea mayor que 23
			if (this.hora == 24) {
				// En este caso le ponemos 0 como valor a la hora
				this.hora = 0;
			}
		}
	}

	/**
	 * Función que almacena la hora
	 * 
	 * @param hora Hora introducida
	 * @return Devuelve si ha sido posible almacenar la hora
	 */
	public boolean setHora(int hora) throws NegativeHourException {
		// Variable donde se almacena si ha sido posible almacenar la hora
		boolean modificado = false;

		if (hora >= 0) {
			// Comprobamos que la hora sea menor o igual que 23
			if (hora <= 23) {
				// Cambiamos el valor de la hora
				this.hora = hora;

				// Cambiamos el valor del boolean
				modificado = true;
			}
		} else {
			throw new NegativeHourException();
		}

		// Devolvemos el booleanç
		return modificado;
	}

	/**
	 * Función que almacena los minutos
	 * 
	 * @param minutos Minutos introducidos
	 * @return Devuelve si ha sido posible almacenar los minutos
	 */
	public boolean setMinutos(int minutos) throws NegativeMinuteException {
		// Variable donde se almacena si ha sido posible almacenar los minutos
		boolean modificado = false;

		if (minutos >= 0) {
			// Comprobamos que los minutos sean menor o igual que 59
			if (minutos <= 59) {
				this.minutos = minutos;

				modificado = true;
			}
		} else {
			throw new NegativeMinuteException();
		}

		// Devolvemos el boolean
		return modificado;
	}

	/**
	 * Función que almacena los segundos
	 * 
	 * @param segundos Segundos introducidos
	 * @return Devuelve si ha sido posible almacenar los segundos
	 */
	public boolean setSegundos(int segundos) throws NegativeSecondException {
		// Variable donde se almacena si ha sido posible almacenar los minutos
		boolean modificado = false;

		if (segundos >= 0) {
			// Comprobamos que los segundos sean menor o igual que 59
			if (segundos <= 59) {
				this.segundos = segundos;

				modificado = true;
			}
		} else {
			throw new NegativeSecondException();
		}

		// Devolvemos el boolean
		return modificado;
	}

	@Override
	public String toString() {
		// Variable donde se almacena la cadena
		String cadena = "";

		// Variable donde se almacena la hora
		String sHora = "";

		// Variable donde se almancenan los minutos
		String sMinutos = "";

		// Variable donde se almancenan los segundos
		String sSegundos = "";

		// Comprobamos si la hora es menor que 10
		if (hora < 10) {
			sHora += "0";
		}

		// Almacenamos la hora
		sHora += String.valueOf(this.hora);

		// Comprobamos si los minutos son menores que 10
		if (minutos < 10) {
			sMinutos += "0";
		}

		// Almacenamos los minutos
		sMinutos += String.valueOf(this.minutos);

		// Comprobamos si los minutos son menores que 10
		if (segundos < 10) {
			sSegundos += "0";
		}

		// Almacenamos los minutos
		sSegundos += String.valueOf(this.segundos);

		// Almacenamos la información
		cadena = sHora + ":" + sMinutos + ":" + sSegundos;

		// Devolvemos la cadena
		return cadena;
	}

}
