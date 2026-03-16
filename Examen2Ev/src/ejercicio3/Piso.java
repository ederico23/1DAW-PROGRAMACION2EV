package ejercicio3;

public class Piso extends Vivienda implements Valorable{

	private int altura;
	private boolean ascensor;
	private double plusAltura = 0.01;
	
	public Piso(String direccion, double superficie, int habitaciones) {
		super(direccion, superficie, habitaciones);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
