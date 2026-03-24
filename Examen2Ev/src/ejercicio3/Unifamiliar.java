package ejercicio3;

public class Unifamiliar extends Vivienda implements Valorable{

	private boolean jardin;
    private static double porcentajeBase = 0.11; // 11% inicial
    	
    public Unifamiliar(String direccion, int superficie, int habitaciones, boolean jardin) {
        super(direccion, superficie, habitaciones);
        this.jardin = jardin;
    }
    
    public static void setPorcentajeBase(double nuevoPorcentaje) { 
    	porcentajeBase = nuevoPorcentaje; 
    	}
    
    @Override
    public double calcularPrecio() {
        double base = getSuperficie() * getPrecioMetroCuadrado();
        double porcentajeAplicado = jardin ? (porcentajeBase + 0.05) : porcentajeBase;
        return base + (base * porcentajeAplicado);
    }
    
    @Override
    public String toString() {
        return "Vivienda Tipo Unifamiliar\nDirección: " + getDireccion() + 
        		"\nHabitaciones: " + getHabitaciones() +
               "\nSuperficie: " + getSuperficie() + 
               "\nJardín: " + (jardin ? "Si" : "No") +
               "\nPrecio: " + calcularPrecio();
    }
	
	
}
