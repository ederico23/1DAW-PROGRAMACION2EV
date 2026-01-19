package interfacesEjemplo;

/*
 * Los metodos de una interfaz son siempre publicos, no hace falta poner "public abstract"
 * Java entiende que todos los metodos de una interfaz son asi por defecto
 * 
 * Los atributos siempre van a ser publicos, estaticos y constantes, tampoco hace falta especificarlo
 */
public interface Encender {
	void encender();
	
	/*
	 * Metodos default sirven para darle cuerpo a un metodo que vaya a ser implementado en otra clase
	 * En esta otra clase entonces no haria falta sobreescribir o darle cuerpo al metodo, teniendo ya 
	 * un comportamiento por defecto. De igual forma en la clase que lo implementa se podria sobreescribir 
	 */
	default void utilizar(){
		System.out.println("Este es el metodo por defecto de encender");
	}
}