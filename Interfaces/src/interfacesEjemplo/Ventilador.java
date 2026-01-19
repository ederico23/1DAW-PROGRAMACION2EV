package interfacesEjemplo;

public class Ventilador implements Encender, Apagar{

	@Override
	public void encender() {
		System.out.println("Se enciende el ventilador");
	}

	@Override
	public void apagar() {
		System.out.println("Se apaga el ventilador");
	}
	
}
