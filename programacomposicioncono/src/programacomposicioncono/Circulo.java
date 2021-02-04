package programacomposicioncono;

	/**
	 * Clase para representar c�rculos en el plano XY.
	 * Cada c�rculo se define con su radio y las coordenadas de 
	 * su centro.
	 * @author Jessica Cabrera
	 * @version 1.0
	 */

public class Circulo {
	
	//Atributos
	private float x, y;
	private float radio;

	/**
	 * Constructor del objeto C�rculo
	 * Crea un c�rculo a partir de su origen y su radio.
	 * @param cX Coordenada x del origen de c�rculo.
	 * @param cY Coordenada y del origen del c�rculo.
	 * @param r Radio del c�rculo cuyo valor ser� mayor o igual a 0
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
	 * Proporciona el valor del radio del c�rculo
	 * @return radio
	 */
	public float getRadio() {
		return radio;
	}
	/**
	 * Establece un nuevo valor para el radio del d�rculo
	 * @param radio
	 */
	public void setRadio(float radio) {
		this.radio = radio;
	}

	
	/**
	 * M�todo que calcula el �rea del c�rculo
	 * @return El �rea del c�rculo.
	 */
	public float area() {
		return (float) Math.PI * radio * radio;
	}

	/**
	 * M�todo que muestra por pantalla los atributos del objeto c�rculo 
	 * adem�s de su �rea
	 */
	public void imprimir() {
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);
		System.out.print(" r=" + radio);
		System.out.print(" A=" + area());
	}
}