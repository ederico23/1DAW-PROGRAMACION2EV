package ejercicio2;

public class Gerente extends Empleado {

	public double bonoPorObjetivos;
	public boolean bonosCumplidos = false;
	
	public Gerente(String nombre, int id, double salarioBase, double bono, boolean cumplidos) {
		super(nombre, id, salarioBase);
		this.bonoPorObjetivos = bono;
		this.bonosCumplidos = cumplidos;
	}

	@Override
	public void calcularSalarioFinal() {
		if(!bonosCumplidos) {
			salarioFinal = salarioBase + bonoPorObjetivos;
		} else {
			salarioFinal = salarioBase;
		}
		
		System.out.println("el salario final de " + getNombre() + " es de "
			+ salarioFinal + "€");
	}

}
