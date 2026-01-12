package formasGeometricas;

public class Rectangulo extends Figura {
	/**
	 *@param base
	 *Base de el rectángulo
	 */
	private double base;
	/**
	 * @param altura
	 * Altura del rectángulo
	 */
	private double altura;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param base
	 * @param altura
	 */
	public Rectangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base=base;
		this.altura=altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}
	
	

}
