package polonorte;

import java.time.LocalDate;


public class PruebaNavidad {

	public static void main(String[] args) throws DatosInvalidosException {

		SantaClaus santa = new SantaClaus();
		String caracterAleatorio = Utils.generarCaracterAleatorio();
		
		LocalDate fechaNavidad = Utils.generarDiaAleatorioDiciembre();
		boolean santaTrabajando = santa.comprobarTrabajo(fechaNavidad);
		
		System.out.println("La fecha de hoy es: " + fechaNavidad);
		System.out.println("¿Está santa trabajando?: " + Utils.convertirBooleanASiNo(santaTrabajando));
		System.out.println("El carácter de santa es: " + santa.generarSaludoSegunCaracter(caracterAleatorio));
		
	}

}
