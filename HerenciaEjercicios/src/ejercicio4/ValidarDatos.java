package ejercicio4;

public class ValidarDatos {
	
	public static boolean validarDNI(String dni) {
		if (!dni.matches("[0-9]{8}[A-Z]")) {
			return false;
		}
		// Validar el digito de control
		String digitoControl = "TRWAGMYFPDXBNJZSQVHLCKE";
		//Extraer el substring numerico del dni
		int numerosDni = Integer.parseInt(dni.substring(0, 7));
		// Resto de dividir nnumerodni entre 23
		int restoCalculoDni = numerosDni % 23;
		// Buscar el caracter en esa posicion en la cadena letras
		char caracterDni = digitoControl.charAt(restoCalculoDni);
		// Si la letra del DNI (Ultimo caracter coincide con la calculada devolver
		// true, si no false
		if (caracterDni == (dni.charAt(7))) {
			return true;
		}
		
		return false;
	}
}