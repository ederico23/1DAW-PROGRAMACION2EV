package ejercicio4;

public class Electronica extends Productos{

	private double impuestoLujo;
	
	public Electronica(String nombre, double precioBase, double impuesto) {
		super(nombre, precioBase);
		this.impuestoLujo = impuesto;
	}
	
	@Override
	public double calcularPrecioFinal() {
		precioFinal = precioBase + impuestoLujo;
		return precioFinal;
	}
	
}
