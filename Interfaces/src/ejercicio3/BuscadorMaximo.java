package ejercicio3;

public class BuscadorMaximo implements Operacion{
	@Override
	public int ejecutar(int[] datos) {
		int numeroMayor = 0;
		for (int i = 0; i < datos.length; i++) {
			if (numeroMayor < datos[i]) {
				numeroMayor = datos[i];
			}
		}
		return numeroMayor;
	}
}
