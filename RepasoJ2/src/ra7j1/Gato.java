package ra7j1;

public class Gato extends Mascota implements Asegurable{

	private boolean isCortadas;

	
	public Gato(String nombre, Integer edad, Double peso, boolean isCortadas) {
		super(nombre, edad, peso);
		this.isCortadas = isCortadas;
	}


	@Override
	public double precioSeguro() {
		double precio = getPrecioBase();
		
		if(isCortadas = false) {
			precio = precio * 0.5;
		}
		
		return precio;
	}


	@Override
	public String hacerSonido() {
		return "El gato hace miau";
	}

	
	
	
}//fin class Gato
