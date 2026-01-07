package herenciaEjemplo3;

public class EmpleadoTemporal extends Empleado{
	private int numeroDiasContrato;
	
	public EmpleadoTemporal(String nombre, int numeroDiasContrato) {
		super(nombre);
		this.numeroDiasContrato = numeroDiasContrato;
	}
	@Override
	public void mostrarInfo() {
		System.out.println("Empleado: "+this.getNombre()+" Dias contrato: "+numeroDiasContrato);
	}
}