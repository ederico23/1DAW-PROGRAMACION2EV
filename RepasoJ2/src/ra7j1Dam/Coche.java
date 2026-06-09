package ra7j1Dam;

public class Coche extends Vehiculo implements Asegurable{

	private Integer numPuertas;
	private boolean isElectrico;
	private final String SONIDO = "Brum";
	private Double seguro = Asegurable.getPrecioSeguro();
	
	public Coche(String matricula, String marca, Integer año, Integer numPuertas, boolean isElectrico) {
		super(matricula, marca, año);
		this.numPuertas = numPuertas;
		this.isElectrico = isElectrico;
	}

	@Override
	public double calcularSeguro() {
		seguro = seguro * 0.3;
		if(isElectrico = true) {
			seguro = seguro /0.15;
		}
		return seguro;
	}

	@Override
	public String hacerSonido() {
		return SONIDO;
	}

}//fin class Coche
