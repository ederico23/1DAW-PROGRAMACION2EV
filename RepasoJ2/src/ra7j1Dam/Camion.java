package ra7j1Dam;

public class Camion extends Vehiculo implements Asegurable{

	private Double tonelaje;
	private Integer numEjes;
	private final String SONIDO = "Piii";
	private Double seguro = Asegurable.getPrecioSeguro();
	
	public Camion(String matricula, String marca, Integer año, Double tonelaje, Integer numEjes) {
		super(matricula, marca, año);
		this.tonelaje = tonelaje;
		this.numEjes = numEjes;
	}

	@Override
	public double calcularSeguro() {
		seguro = seguro * 1.4;
		
		seguro = seguro + seguro*(numEjes-2)*0.1;
		
		return seguro;
	}
	@Override
	public String hacerSonido() {
		return SONIDO;
	}
	
	
	
}//fin class Camion
