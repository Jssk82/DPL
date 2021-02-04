package programacomposicioncono;

	/**
	 * Clase para representar círculos en el plano XY.
	 * Cada círculo se define con su radio y las coordenadas de 
	 * su centro.
	 * @author Jessica Cabrera
	 * @version 1.0
	 */

public class Circulo {
	
	//Atributos
	private float x, y;
	private float radio;

	/**
	 * Constructor del objeto Círculo
	 * Crea un círculo a partir de su origen y su radio.
	 * @param cX Coordenada x del origen de círculo.
	 * @param cY Coordenada y del origen del círculo.
	 * @param r Radio del círculo cuyo valor será mayor o igual a 0
	 */
	public Circulo(float cX, float cY, float r) { 
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}
	
	/**
	 * Proporciona el valor de la coordenada X del circulo
	 * @return X
	 */
	public float getX() {
		return x;
	}
	/**
	 * Establece un nuevo valor para la coordenada X
	 * @param x
	 */
	public void setX(float x) {
		this.x = x;
	}
	/**
	 * Proporciona el valor de la coordenada Y del circulo
	 * @return Y
	 */
	public float getY() {
		return y;
	}
	/**
	 * Establece un nuevo valor para la coordenada Y
	 * @param y
	 */
	public void setY(float y) {
		this.y = y;
	}
	/**
	 * Proporciona el valor del radio del círculo
	 * @return radio
	 */
	public float getRadio() {
		return radio;
	}
	/**
	 * Establece un nuevo valor para el radio del dírculo
	 * @param radio
	 */
	public void setRadio(float radio) {
		this.radio = radio;
	}

	
	/**
	 * Método que calcula el área del círculo
	 * @return El área del círculo.
	 */
	public float area() {
		return (float) Math.PI * radio * radio;
	}

	/**
	 * Método que muestra por pantalla los atributos del objeto círculo 
	 * además de su área
	 */
	public void imprimir() {
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);
		System.out.print(" r=" + radio);
		System.out.print(" A=" + area());
	}
}