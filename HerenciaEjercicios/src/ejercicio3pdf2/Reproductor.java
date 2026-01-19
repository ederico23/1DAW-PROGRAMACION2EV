package ejercicio3pdf2;

public interface Reproductor {
	void reproducir();
	
	/* Este metodo no obliga a que las clase que implementen esta interfaz, lo tengan que tener
	*  si quito el default daria error en todas las otras clases que ya lo implementan, ya que 
	*  habria que implementarlo en cada una de ellas
	*/
	default void pausar() {
		System.out.println("Sistema pausado");
	}
}
