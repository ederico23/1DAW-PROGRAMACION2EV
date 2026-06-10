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
	    // Empezamos con el precio base + 40% (1.40)
	    double total = seguro * 1.40; 
	    
	    // Si tiene más de 2 ejes, sumamos un 10% del precio base por cada uno
	    if (numEjes > 2) {
	        int ejesExtras = numEjes - 2;
	        total += ejesExtras * (seguro * 0.10);
	    }
	    
	    return total;
	}

	@Override
	public String hacerSonido() {
		return SONIDO;
	}
	
	
	
}//fin class Camion
