package herenciaEjemplo3;

public class EmpleadoFijo extends Empleado{
	private int numeroDiasContrato;
	
	public EmpleadoFijo(String nombre, int numeroDiasContrato) {
		super(nombre);
		this.numeroDiasContrato = numeroDiasContrato;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Empleado " + this.getNombre() + " salario: " + numeroDiasContrato);
	}
}
