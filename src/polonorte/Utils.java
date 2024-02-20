package polonorte;

import java.time.LocalDate;
import java.util.Random;

/**
 * Clase que contiene métodos útiles para el programa. 
 * 
 * @author Melchor
 * @version 1.2
 *
 */
public class Utils {

	// Las constantes relacionadas con el caracter de SantaClaus o de un reno
	public static final String CARACTER_AMIGABLE = "AMIGABLE";
	public static final String CARACTER_CABREADO = "CABREADO";
	public static final String CARACTER_FURIOSO = "FURIOSO";
	
	public static final String VALOR_SI = "SI";
	public static final String VALOR_NO = "NO";

	
	private static Random generador = new Random();

	/**
	 * Genera una fecha entre el 22 y 25 de diciembre del presente año, calculando el día de forma aleatoria
	 * @return fecha entre el 22 y 25 de diciembre
	 * @see Random
	 * @since 1.0
	 */
	public static LocalDate generarDiaAleatorioDiciembre() {
		
		int numEntre22Y25 = generador.nextInt(4)+22;
		return LocalDate.of(LocalDate.now().getYear(), 12, numEntre22Y25);
	}

	/**
	 * Genera un carácter aleatorio de entre los posibles, generando un número aleatorio y calculando el módulo 3.
	 * Los valores que devuelve se corresponden con los de las constantes de esta clase.
	 * @return Carácter generado. Dentro de los posibles: AMIGABLE, CABREADO y FURIOSO
	 */
	public static String generarCaracterAleatorio() {

		
		int numeroAleatorio = generador.nextInt(150);
		String caracter;
		switch (numeroAleatorio % 3) {
		case 0:
			caracter = CARACTER_AMIGABLE;
			break;
		case 1:
			caracter = CARACTER_CABREADO;
			break;
		case 2:
		default:
			caracter = CARACTER_FURIOSO;
		}

		return caracter;
	}
	
	/**
	 * Transforma un valor booleano en cadena de carácter que representa "SI" o "NO".
	 * @param valor Valor booleano de entrada
	 * @return Valor de "SI" si el parámetro es true, "NO" en caso contrario
	 */
	public static String convertirBooleanASiNo(boolean valor) {
		return valor ? VALOR_SI : VALOR_NO;
	}

}
