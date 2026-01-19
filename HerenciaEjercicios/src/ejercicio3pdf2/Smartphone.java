package ejercicio3pdf2;

public class Smartphone implements Grabador{
	/*
	 * Al implementar Grabador que heredaba de Reproductor, 
	 * se tienen que implementar los metodos de cada interfaz
	 */
	@Override
	public void reproducir() {
		System.out.println("Reproduce");
		
	}

	@Override
	public void grabar() {
		System.out.println("Graba");
		
	}
	
	

}