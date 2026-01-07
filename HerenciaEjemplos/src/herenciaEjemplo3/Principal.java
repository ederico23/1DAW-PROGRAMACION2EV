package herenciaEjemplo3;

public class Principal {

	public static void main(String[] args) {
		EmpleadoFijo e1 = new EmpleadoFijo("Mario", 1250);
		EmpleadoTemporal t1 = new EmpleadoTemporal("Luis", 15);
		Empleado empleado = new Empleado("Karen");
		
		e1.mostrarInfo();
		t1.mostrarInfo();
		empleado.mostrarInfo();

	}

}
