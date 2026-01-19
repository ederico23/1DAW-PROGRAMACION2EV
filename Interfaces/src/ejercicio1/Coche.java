package ejercicio1;

public class Coche implements Reasonable{
	
	private double cilindrada;

	/**
	 * @param cilindrada
	 */
	public Coche(double cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	@Override
	public String emitirSonido() {
		return "Vroom, vroom";
	}
	
	
	
}
