package ra7j1Dam;

public class Moto extends Vehiculo implements Asegurable {

	private Integer cilindrada;
	private boolean tieneCarnet;
	private final String SONIDO = "Rroommm";
	private Double seguro = Asegurable.getPrecioSeguro();
	
	
	public Moto(String matricula, String marca, Integer año, Integer cilindrada, boolean tieneCarnet) {
		super(matricula, marca, año);
		this.cilindrada = cilindrada;
		this.tieneCarnet = tieneCarnet;
	}
	
	@Override
	public double calcularSeguro() {
		if (tieneCarnet = true) {
			seguro = seguro * 0.2;
		} else {
			seguro = seguro * 3;
		}
		return seguro;
	}
	
	@Override
	public String hacerSonido() {
		return SONIDO;
	}
	
}//fin class Moto
