package ejercicio3;

public class Piso extends Vivienda{
	
	private int altura;
    private boolean ascensor;
	
    public Piso(String direccion, int superficie, int habitaciones, int altura, boolean ascensor) {
        super(direccion, superficie, habitaciones);
        this.altura = altura;
        this.ascensor = ascensor;
    }
	
    @Override
    public double calcularPrecio() {
        double base = getSuperficie() * getPrecioMetroCuadrado();
        return base + (base * (altura * 0.01));
    }
	
    @Override
    public String toString() {
        return "Vivienda Tipo: Piso\nDirección: " + getDireccion() + 
        		"\nHabitaciones: " + getHabitaciones() +
               "\nSuperficie: " + getSuperficie() + 
               "\nAltura: " + altura + 
               "\nAscensor: " + (ascensor ? "Si" : "No") +
               "\nPrecio: " + calcularPrecio();
    }
    
	
}
