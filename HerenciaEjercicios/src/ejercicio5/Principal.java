package ejercicio5;

import java.util.Arrays;


public class Principal {
	public static void main(String[] args) {
		Empleado[] listaEmpleados = new Empleado[10];
		llenarArrayEmpleados(listaEmpleados);
		System.out.println(Arrays.toString(listaEmpleados));
	}
	/**
	 * Metodo para llenar el array de cooperantes con datos aleatorios
	 * @param listaCooperantes lista de cooperantes que rellenar
	 */
	public static void llenarArrayEmpleados(Empleado[] listaEmpleados) {
		String[] nombres = {"Mario", "Javier", "Antonio", "Maria", "Kim", "Carla"};
		int edad = (int)Math.random()*100;
		String[] departamentos = {"Finanzas", "IT", "Recursos humanos"};
		
		for (int i = 0; i < listaEmpleados.length; i++) {
			// Variable para elegir aleatoriamente el nombre
			double numeroNombre = Math.random()*5;
			// Variable a la cual le daremos un nombre aleatorio
			String nombre = nombres[(int)(numeroNombre)];
			// Variable para elegir aleatoriamente el departamento
			double numeroDepartamento = Math.random()*2;
			// Variable a la cual le daremos un departamento aleatorio
			String departamento = departamentos[(int)(numeroDepartamento)];
			// Variables para aleatorizar si lo que se añade a la lista de empleados es un jefe o un empleado normal
			int numeroAleatorioEmpleadoJefe = (int)(Math.random()*3)+1;
			if (numeroAleatorioEmpleadoJefe == 1) {
				listaEmpleados[i] = new Empleado (nombre, edad);
			} else {
				listaEmpleados[i] = new Jefe (nombre, edad, departamento);
			}
		}
	}
}