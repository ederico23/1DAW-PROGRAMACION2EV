package ejercicio1;
/**
 * main de los personajes de fantasia
 * @author ederg
 * @version 1.0 08/01/26
 */
public class Principal {

	public static void main(String[] args) {
		
		
		Personaje listaPersonaje[] = new Personaje[10];
		
		llenarLista(listaPersonaje);
		int contadorArqueros= 0;
		int contadorMagos=0;
		int contadorGuerreros=0;
		for (int i = 0; i<listaPersonaje.length;i++) {
			System.out.println(listaPersonaje[i].mostrarInfo());
			if(listaPersonaje[i] instanceof Arquero) {
				contadorArqueros++;
			} else if (listaPersonaje[i] instanceof Mago) {
				contadorMagos++;
			} else if(listaPersonaje[i] instanceof Guerrero) {
				contadorGuerreros++;
			}
		}
		System.out.println("tengo contador de arqueros " + contadorArqueros);
		System.out.println("tengo contador de magos " + contadorMagos);
		System.out.println("tengo contador de guerreros " + contadorGuerreros);
		/*
		 * for (Personaje p:listaPersonaje) { System.out.println(p.atacar()); if (p
		 * instanceof Guerrero) { System.out.println("el Guerrero tiene 100 de fuerza"
		 * ); } else if (p instanceof Mago) {
		 * System.out.println("el Mago tiene 100 de mana"); } else if (p instanceof
		 * Arquero) { System.out.println("el Arquero tiene 100 flechas"); } }
		 */
		
	}
	/**
	 * metodo para rellenar los datos de los personajes
	 * @param listaPersonaje
	 */
	private static void llenarLista(Personaje[] listaPersonaje) {
		for (int i = 0; i < listaPersonaje.length; i++) {
			int numero = (int) (Math.random()*3);//este numero decide el tipo de personaje que creamos
			int numNivel = (int) (Math.random()*50+1);//nivel de todos los personajes
		switch (numero) {
		case 0: 
			int numFuerza = (int) (Math.random()*100+1);//numero de fuerza
			listaPersonaje[i] = new Guerrero("Arturo", numNivel, numFuerza);
			break;
		case 1:
			int numMana = (int) (Math.random()*100+1);//cantidad de mana
			listaPersonaje[i] = new Mago("De Hielo", numNivel, numMana);
			break;
		case 2:
			int numFlechas = (int) (Math.random()*100+1); //cantidad de flechas
			listaPersonaje[i] = new Arquero("Arquero Magico", numNivel, numFlechas);
			break;
			}
		}
		
	}

}