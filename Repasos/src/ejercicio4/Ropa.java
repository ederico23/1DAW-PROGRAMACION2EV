package ejercicio4;

public class Ropa extends Productos implements Descontable{

	private String talla;
	
	public Ropa(String nombre, double precioBase, String talla) {
		super(nombre, precioBase);
		this.talla = talla;
	}

	@Override
	public double calcularPrecioFinal() {
		return getPrecioBase();
	}

	@Override
	public double aplicarDescuento(double porcentaje) {
		double precioDescuento;
		
		precioDescuento = getPrecioBase() - (getPrecioBase() * porcentaje/100);
		return precioDescuento;
	}

	


}
