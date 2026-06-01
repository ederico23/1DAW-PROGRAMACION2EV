package ejercicio2;

import java.util.Scanner;

public class GestionCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creamos 3 salas con datos inventados
        SalaCine s1 = new SalaCine("Spiderman", 5, 8);
        SalaCine s2 = new SalaCine("Batman", 4, 6);
        SalaCine s3 = new SalaCine("Avatar", 6, 10);
        SalaCine[] salas = {s1, s2, s3};
        
        // Creamos el cine
        Cine cine = new Cine("Cine Palafox", salas);
        
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("0.- Salir");
            System.out.println("1.- Comprar entrada");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    // Mostramos las salas disponibles
                    System.out.println(cine.mostrarSalas());
                    System.out.print("Elige sala (1-3): ");
                    int numSala = sc.nextInt() - 1; // -1 porque el array empieza en 0
                    
                    // Mostramos el mapa de ocupación de esa sala
                    SalaCine salaElegida = cine.getSalas()[numSala];
                    salaElegida.muestraSala();
                    
                    // Pedimos fila y butaca
                    System.out.print("Introduce fila: ");
                    int fila = sc.nextInt();
                    System.out.print("Introduce butaca: ");
                    int butaca = sc.nextInt();
                    
                    // Intentamos comprar
                    if (salaElegida.comprarEntrada(fila, butaca)) {
                        System.out.println("Entrada comprada correctamente.");
                        salaElegida.muestraSala(); // mostramos el mapa actualizado
                    } else {
                        System.out.println("Error: butaca no disponible o fuera de rango.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        
        sc.close();
    }
}