
package modelo;

import java.util.Random;

public class JuegoModelo {

    private int numeroSecreto;

    public JuegoModelo() {
        Random random = new Random();
        numeroSecreto = random.nextInt(10) + 1;
    }

    public boolean comprobarNumero(int numero) {
        return numero == numeroSecreto;
    }
}
