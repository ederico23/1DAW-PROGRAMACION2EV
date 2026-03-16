package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo v1 = null;
		
		String marca = Leer.leerFrase("dime la marca del coche");
		String color = Leer.leerFrase("dime el color del coche");
		String matricula = Leer.leerFrase("dime la matricula del coche");
		
		try {
			v1 = new Vehiculo(marca, color, matricula);
		} catch (MatriculaErroneaException e) {
			System.out.println(e.getMessage());
			
			String matricula2 = Leer.leerFrase("dime la matricula del coche");
			
			try {
				v1 = new Vehiculo(marca, color, matricula2);
			} catch (MatriculaErroneaException e2) {
				System.out.println(e2.getMessage() + "\nSe te han acabado las oportunidades");
			}
			
		}
		
		if (v1!=null) {
			System.out.println("Has creado el coche correctamente");
			System.out.println("Marca: " + v1.getMarca());
			System.out.println("Color: " + v1.getColor());
			System.out.println("Matricula: " + v1.getMatricula());
		} else {
			System.out.println("No se ha creado correctamente el coche");
		}
		
	}

}
