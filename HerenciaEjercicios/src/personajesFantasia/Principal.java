package personajesFantasia;

public class Principal {

	public static void main(String[] args) {
		
		Personaje listaPersonaje[] = new Personaje[10];
		
		for (int i = 0; i < listaPersonaje.length; i++) {
			int numero = (int) (Math.random()*3);
			int numFuerza = (int) (Math.random()*100+1);
			int numMana = (int) (Math.random()*100+1);
			int numFlechas = (int) (Math.random()*100+1);
			int numNivel = (int) (Math.random()*50+1);
		switch (numero) {
		case 0: 
			listaPersonaje[i] = new Guerrero("Arturo", numNivel, numFuerza);
			break;
		case 1:
			listaPersonaje[i] = new Mago("De Hielo", numNivel, numMana);
			break;
		case 2:
			listaPersonaje[i] = new Arquero("Arquero Magico", numNivel, numFlechas);
			break;
			}
		}
		for (Personaje p:listaPersonaje) {
		System.out.println(p.atacar());
		if (p instanceof Guerrero) {
			System.out.println("el Guerrero tiene 100 de fuerza" );
			} else if (p instanceof Mago) {
				System.out.println("el Mago tiene 100 de mana");
			} else if (p instanceof Arquero) {
				System.out.println("el Arquero tiene 100 flechas");
			}
		}
		
	}

}
