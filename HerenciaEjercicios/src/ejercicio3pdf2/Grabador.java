package ejercicio3pdf2;

public interface Grabador extends Reproductor{
	/*
	 * Al heredar una interfaz obliga a la clase que implemente esta interfaz que tenga que implementar
	 * sus metodos obligatoriamente
	 */
	void grabar();
}
