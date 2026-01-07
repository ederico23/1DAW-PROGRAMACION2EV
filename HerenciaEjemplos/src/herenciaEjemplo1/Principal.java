package herenciaEjemplo1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona ("Eder");
		p.presentarse();
		
		Alumno a = new Alumno ("Eder" , "1º DAW");
		a.presentarse();
		//si el metodo de la clase hija no esta implementado ejecuta el del padre
		
		Persona p2 = new Alumno("Alejandro", "1º");
		p2.presentarse();
		
		System.out.println("--------------------------");
		
		System.out.println(p.getClass());
		System.out.println(a.getClass());
		System.out.println(p2.getClass());
		
		System.out.println("--------------------------");
		
		//operador que devuelve true o false si "p" es una Persona. 
		//puede usarse con ifs
		System.out.println(p instanceof Persona);
		System.out.println(p2 instanceof Persona);
		System.out.println(p2 instanceof Alumno);
		System.out.println(a instanceof Alumno);
		System.out.println(a instanceof Persona);
	}
	
}
