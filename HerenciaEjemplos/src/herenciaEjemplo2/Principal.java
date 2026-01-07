package herenciaEjemplo2;

public class Principal {

	public static void main(String[] args) {

		Animal a1 = new Vaca();
		System.out.println(a1.sonido());
		
		Animal[] listaAnimales = new Animal[10];
		
		for (int i = 0; i<listaAnimales.length; i++) {
			int numero = (int) (Math.random()*4);
			switch (numero) {
			case 0: 
				listaAnimales[i] = new Animal();
				break;
			case 1: 
				listaAnimales[i] = new Vaca();
				break;
			case 2: 
				listaAnimales[i] = new Perro();
				break;
			case 3: 
				listaAnimales[i] = new Pollo();
				break;
			}
		}
		//recorrer el array
		for (Animal a: listaAnimales) {
			System.out.println("El animal es una " + a.getClass());
			System.out.println(a.sonido());
		}
	}

}
