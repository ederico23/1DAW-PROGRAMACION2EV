package ejercicio3;

public class Unifamiliar extends Vivienda implements Valorable{

	private boolean jardin;
	//NO ENTIENDO LO DEL 11%
	private final double PLUS_JARDIN = 0.05;
	
	public Unifamiliar(String direccion, double superficie, int habitaciones) {
		super(direccion, superficie, habitaciones);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
