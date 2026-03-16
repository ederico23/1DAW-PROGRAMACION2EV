package ejercicio2;

public class Desarrollador extends Empleado {

	private int lineasDeCodigoPorMes;
	double bonus;
	
	public Desarrollador(String nombre, int id, double salarioBase, int lineas, double bonus) {
		super(nombre, id, salarioBase);
		this.lineasDeCodigoPorMes = lineas;
		this.bonus = bonus;
	}

	
	@Override
	public void calcularSalarioFinal() {
		if (lineasDeCodigoPorMes >= 2000) {
			salarioFinal = salarioBase + bonus;
		} else {
			salarioFinal = salarioBase;
		}
	System.out.println("el salario final de " + getNombre() + " es de "
			+ salarioFinal + "€");
	}


	/**
	 * @return the lineasDeCodigoPorMes
	 */
	public int getLineasDeCodigoPorMes() {
		return lineasDeCodigoPorMes;
	}


	/**
	 * @param lineasDeCodigoPorMes the lineasDeCodigoPorMes to set
	 */
	public void setLineasDeCodigoPorMes(int lineasDeCodigoPorMes) {
		this.lineasDeCodigoPorMes = lineasDeCodigoPorMes;
	}
	
	
		
}
