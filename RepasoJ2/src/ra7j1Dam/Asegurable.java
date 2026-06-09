package ra7j1Dam;

public interface Asegurable {
	
	static double precio_base = 400.0;
	
	public static double getPrecioSeguro() {
		return precio_base;
	}
	
	public static void setPrecioSeguro(double nuevoPrecio) {
		nuevoPrecio = precio_base;
	}
	
	double calcularSeguro();
	
	
}
