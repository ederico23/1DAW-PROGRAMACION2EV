package claseLeer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * clase leer
 * 
 * proporciona métodos estáticos para leer datos por teclado de distintos tipos
 * (int, double, String y boolean), gestionando las excepciones y solicitando
 * de nuevo el dato en caso de error.
 * 
 *
 * incluye versiones de los métodos con y sin mensaje.
 * 
 *
 * @author ederg
 * @version 1.0 05/02/26
 */
public class Leer {

    /**
     * scanner estático para la entrada por teclado.
     */
    private static final Scanner sc = new Scanner(System.in);

    /**
     * eee un número entero mostrando un mensaje.
     *
     * @param mensaje Mensaje que se mostrará al usuario
     * @return número entero introducido correctamente
     */
    public static int leerInt(String mensaje) {
        int numero = 0;
        boolean correcto = false;

        do {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("error: introduce un número entero");
            } finally {
                sc.nextLine();
            }
        } while (!correcto);

        return numero;
    }

    /**
     * lee un número entero sin mostrar mensaje.
     *
     * @return número entero introducido correctamente
     */
    public static int leerInt() {
        return leerInt("");
    }

    /**
     * lee un número decimal mostrando un mensaje.
     *
     * @param mensaje Mensaje que se mostrará al usuario
     * @return número decimal introducido correctamente
     */
    public static double leerDouble(String mensaje) {
        double numero = 0.0;
        boolean correcto = false;

        do {
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("error: introduce un número decimal.");
            } finally {
                sc.nextLine();
            }
        } while (!correcto);

        return numero;
    }

    /**
     * lee un número decimal sin mostrar mensaje.
     *
     * @return número decimal introducido correctamente
     */
    public static double leerDouble() {
        return leerDouble("");
    }

    /**
     * lee una cadena de texto mostrando un mensaje.
     *
     * @param mensaje Mensaje que se mostrará al usuario
     * @return cadena de texto introducida
     */
    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    /**
     * lee una cadena de texto sin mostrar mensaje.
     *
     * @return cadena de texto introducida
     */
    public static String leerString() {
        return leerString("");
    }

    /**
     * lee un valor booleano mostrando un mensaje.
     * El usuario debe introducir true o false.
     * 
     *
     * @param mensaje Mensaje que se mostrará al usuario
     * @return valor booleano introducido correctamente
     */
    public static boolean leerBoolean(String mensaje) {
        boolean valor = false;
        boolean correcto = false;

        do {
            try {
                System.out.print(mensaje);
                valor = sc.nextBoolean();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("error: introduce true o false.");
            } finally {
                sc.nextLine();
            }
        } while (!correcto);

        return valor;
    }

    /**
     * lee un valor booleano sin mostrar mensaje.
     *
     * @return valor booleano introducido correctamente
     */
    public static boolean leerBoolean() {
        return leerBoolean("");
    }
}
