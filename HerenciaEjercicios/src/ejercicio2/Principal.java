package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Figura listaFiguras[] = new Figura[10]; //creamos array
	
		
		
	}
	
	private static void llenarLista(Figura[] listaFiguras) {
		for (int i = 0; i < listaFiguras.length; i++) {
			int numero = (int) (Math.random()*2);//este numero decide el tipo de figuras que creamos
			int opcion = 0; //numero del switch
			
			switch (opcion) {
			case 0: 
				//listaFiguras[i] = new Circulo()
				break;
			}
		}//fin fot
	}//fin llenarLista
}//fin class