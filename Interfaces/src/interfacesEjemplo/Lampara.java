package interfacesEjemplo;

public class Lampara implements Encender, Apagar{
	int tamanyo;
	
	public Lampara(int tamanyo) {
		super();
		this.tamanyo = tamanyo;
	}

	@Override
	public void encender() {
		System.out.println("Se encendio la luz de la lampara");
	}

	@Override
	public void apagar() {
		System.out.println("Se apago la luz de la lampara");
	}
}

