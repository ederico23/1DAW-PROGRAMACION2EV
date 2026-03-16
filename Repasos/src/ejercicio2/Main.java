package ejercicio2;

public class Main {

	public static void main(String[] args) {

		Empleado[] empleados = new Empleado[6];
		
		empleados[0] = new Desarrollador("eder", 01, 1200, 2500, 300);
		empleados[1] = new Gerente("paco", 02, 1500, 400, true);
		
		// desarrollador o gerente SON EMPLEADOS, y los tratan a los 
		// 2 como si fueran iguales
		for(Empleado e : empleados) {
			//si hay posiciones del array vacias las salta
			if (e != null) {
				e.calcularSalarioFinal();
				
				//si ahora quiero imprimir las lineas que ha hecho el desarrollador
				if (e instanceof Desarrollador) {
					//convertimos el empleado en DESARROLLADOR
					Desarrollador d = (Desarrollador) e;
					System.out.println("el desarrollador ha escrito " + d.getLineasDeCodigoPorMes() + " lineas");
				}
			}
		}
	}

}
