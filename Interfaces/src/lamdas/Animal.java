package lamdas;

public class Animal {
	 private String nombre;

	    public Animal(String nombre) {
	        this.nombre = nombre;
	    }

	    public void realizarAccion(Accion accion) {
	        System.out.print(nombre + ": ");
	        accion.ejecutar();
	    }

}