package ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vivienda> lista = new ArrayList<>();
        llenarViviendas(lista);
        
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ INMOBILIARIA ---");
            System.out.println("1.- Mostrar todas las viviendas");
            System.out.println("2.- Mostrar todos los unifamiliares");
            System.out.println("3.- Mostrar todos los pisos");
            System.out.println("0.- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> mostrarFiltrado(lista, "todas");
                case 2 -> mostrarFiltrado(lista, "unifamiliar");
                case 3 -> mostrarFiltrado(lista, "piso");
            }
        } while (opcion != 0);
    }

    public static void llenarViviendas(ArrayList<Vivienda> lista) {
        lista.add(new Piso("Calle Zaragoza 1", 80, 3, 2, true));
        lista.add(new Piso("Calle Barcelona 5", 50, 1, 8, false));
        lista.add(new Piso("Avd. Madrid 10", 120, 4, 1, true));
        lista.add(new Unifamiliar("Calle Huesca 1", 200, 5, true));
        lista.add(new Unifamiliar("Calle Teruel 44", 150, 3, false));
        lista.add(new Unifamiliar("Calle Valencia 2", 180, 4, true));
    }

    public static void mostrarFiltrado(ArrayList<Vivienda> lista, String tipo) {
        lista.stream()
            .filter(v -> {
                if (tipo.equals("piso")) return v instanceof Piso;
                if (tipo.equals("unifamiliar")) return v instanceof Unifamiliar;
                return true;
            })
            // Ordenamos de más barata a más cara
            .sorted(Comparator.comparingDouble(Vivienda::calcularPrecio))
            .forEach(v -> {
                System.out.println(v);
                System.out.println("--------------------");
            });
    

	}

}
