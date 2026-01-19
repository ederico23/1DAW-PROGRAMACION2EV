package ejercicio3;

public class Sumador implements Operacion{
	@Override
	public int ejecutar(int[] datos) {
		int sumaDatos = 0;
		for (int i = 0; i < datos.length; i++) {
			sumaDatos += datos[i];
		}
		return sumaDatos;
	}
}