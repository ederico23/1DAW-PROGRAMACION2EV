package utilidades;
public class ValidarDatos {
	
	public static boolean validarDNI(String dni) {
		if (!dni.matches("[0-9]{8}[A-Z]")) {
			return false;
		}
		// Validar el digito de control
		String digitoControl = "TRWAGMYFPDXBNJZSQVHLCKE";
		//Extraer el substring numerico del dni
		int numerosDni = Integer.parseInt(dni.substring(0, 8));
		// Resto de dividir nnumerodni entre 23
		int restoCalculoDni = numerosDni % 23;
		// Buscar el caracter en esa posicion en la cadena letras
		char caracterDni = digitoControl.charAt(restoCalculoDni);
		// Si la letra del DNI (Ultimo caracter coincide con la calculada devolver
		// true, si no false
		if (caracterDni == (dni.charAt(8))) {
			return true;
		}
		
		return false;
	}
	public static String generarDni() {
		int numeroDni = (int)(Math.random()*99999899)+100;
		String dni = ""+numeroDni;
		
		if (String.valueOf(numeroDni).length() == 3) {
			dni = "00000"+dni;
		} else if (String.valueOf(numeroDni).length() == 4) {
			dni = "0000"+dni;
		} else if (String.valueOf(numeroDni).length() == 5) {
			dni = "000"+dni;
		} else if (String.valueOf(numeroDni).length() == 6) {
			dni = "00"+dni;
		} else if (String.valueOf(numeroDni).length() == 7) {
			dni = "0"+dni;
		}
		
		String digitoControl = "TRWAGMYFPDXBNJZSQVHLCKE";
		for (int i = 0; i < digitoControl.length(); i++) {
			if (numeroDni % 23 == i) {
				dni = dni + digitoControl.charAt(i);
			}
		}
		
		return dni;
	}
}