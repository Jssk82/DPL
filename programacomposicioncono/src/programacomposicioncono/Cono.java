package programacomposicioncono;

	/**
	 * Clase para representar conos definidos por su base, su altura
	 * y un color como atributo.
	 * Para definir su base circular se har� uso de un objeto C�rculo.
	 * @author Jessica Cabrera
	 * @version 1.0
	 */

public class Cono {
	
	//Atributos
	private Circulo base;
	private float altura;
	private String color;

	/**
	 * Constructor del objeto Cono.
	 * Crea un cono a partir de su base, su altura y su color.
	 * @param cX Coordenada x del origen del c�rculo.
	 * @param cY Coordenada y del origen del c�rculo.
	 * @param r  Radio del c�rculo cuyo valor ser� mayor o igual a 0
	 * @param h	 Altura del cono. Valor mayor o igual a cero.
	 * @param color	 Color del cono
	 */
	public Cono(float cX, float cY, float r, float h, String color) { 
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}
	
	/**
	 * Devuelve el valos de la base del cono
	 * @return base
	 */
	public Circulo getBase() {
		return base;
	}
	/**
	 * Establece un valor de la base del cono
	 * @param base
	 */
	public void setBase(Circulo base) {
		this.base = base;
	}
	/**
	 * Proporciona la altura del cono
	 * @return altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * Establece la nueva altura del cono
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	/**
	 * Proporciona el color del cono
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Establece un nuevo color para el cono
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * M�todo que muestra por pantalla los atributos de un cono.
	 * Se har� uso cel m�todo imprimir() de la clase C�rculo para 
	 */
	public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}
