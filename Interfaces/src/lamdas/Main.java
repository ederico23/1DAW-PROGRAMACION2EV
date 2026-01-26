package lamdas;

public class Main {

	public static void main(String[] args) {
		 Animal perro = new Animal("Rex");
		 // pasar objetos de la clase que implementa la interface
		 perro.realizarAccion(new Ladrar());
		 
		 // una clase anónima
		 
		 perro.realizarAccion(new Accion() {

			@Override
			public void ejecutar() {
				System.out.println("Accion de la clase anonima");
				
			}});
		 
		 
		 

	        // Lambda 1
	        perro.realizarAccion(() -> System.out.println("está ladrando"));

	        // Lambda 2
	        perro.realizarAccion(() -> System.out.println("está durmiendo"));

	        // Lambda 3
	        perro.realizarAccion(() -> System.out.println("está comiendo"));
	        
	        //definir accion
	        Accion a= ()->System.out.println("accion definida");
	        perro.realizarAccion(a);

	}
	
	// clases internas
	
	public static class Ladrar implements Accion {
	    @Override
	    public void ejecutar() {
	        System.out.println("está ladrando 🐕");
	    }
	}

	public static class Dormir implements Accion {
	    @Override
	    public void ejecutar() {
	        System.out.println("está durmiendo");
	    }
	}

	public static class Comer implements Accion {
	    @Override
	    public void ejecutar() {
	        System.out.println("está comiendo");
	    }
	}


}