package herenciaEjemplo3;

public class EmpleadoFijo extends Empleado{
	private double salarioMensual;
	
	public EmpleadoFijo(String nombre, double salarioMensual) {
		super(nombre);
		this.salarioMensual = salarioMensual;
	}
	@Override
	public void mostrarInfo() {
		System.out.println("Empleado: "+this.getNombre()+" Salario: "+salarioMensual);
	}
}