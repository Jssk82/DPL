package programacomposicioncono;

	/**
	 * Programa que calcula los par�metros de un cono a partir de un
	 * radio r aleatorio
	 * @author Jessica Cabrera 
	 * @version 1.0
	 */

public class ProgramaComposicionCono {
	
	/**
	 * Clase principal de ProgramaComposicionCono.java
	 * Aqu� se definen cuantas veces se quiere hacer el c�lculo de los
	 * par�metos del cono
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 2, radio, i, "Azul");
			cono.imprimir();
		}
	}
}