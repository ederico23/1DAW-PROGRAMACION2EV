package app;

import controlador.JuegoControlador;
import modelo.JuegoModelo;
import vista.*;

public class Main {
    public static void main(String[] args) {
        JuegoModelo modelo = new JuegoModelo();
        JuegoVista vista = new JuegoVistaConsola();
        JuegoControlador controlador = new JuegoControlador(modelo, vista);

        controlador.iniciarJuego();
    }
}