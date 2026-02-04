
package vista;

import javax.swing.JOptionPane;

public class JuegoVistaVentana implements JuegoVista {

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Juego",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    @Override
    public int pedirNumero() {
        while (true) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Introduce un número:",
                    "Entrada",
                    JOptionPane.QUESTION_MESSAGE
            );

            // Si el usuario cancela
            if (input == null) {
                mostrarMensaje("Entrada cancelada");
                return -1; // o lanza una excepción si prefieres
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                mostrarMensaje("Por favor, introduce un número válido.");
            }
        }
    }
}
