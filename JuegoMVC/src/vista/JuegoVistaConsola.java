
package vista;

import java.util.Scanner;

public class JuegoVistaConsola implements JuegoVista {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public int pedirNumero() {
        System.out.print("Introduce un número del 1 al 10: ");
        return scanner.nextInt();
    }
}
