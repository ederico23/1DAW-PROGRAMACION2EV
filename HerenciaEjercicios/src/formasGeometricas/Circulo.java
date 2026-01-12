package formasGeometricas;

public class Circulo extends Figura {
	/**
	 * radio
	 * El radio del círculo
	 */
	private double radio;
	/**
	 * Constructor
	 * @param nombre
	 * nombre del círculo
	 * @param radio
	 * radio del círculo
	 * 
	 */
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	
	/**
	 * 
	 */
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
}
