package ejercicio2;

public class Cine {
    
    private String nombreCine;
    // static: el mismo precio para todos los cines
    private static double precioEntrada = 8.0;
    private SalaCine[] salas;
    
    public Cine(String nombreCine, SalaCine[] salas) {
        this.nombreCine = nombreCine;
        this.salas = salas;
    }
    
    // Getters y setters
    public String getNombreCine() { return nombreCine; }
    public SalaCine[] getSalas() { return salas; }
    public static double getPrecioEntrada() { return precioEntrada; }
    public static void setPrecioEntrada(double precio) { precioEntrada = precio; }
    
    // Devuelve un String con todas las salas y sus películas
    public String mostrarSalas() {
        String resultado = "";
        for (int i = 0; i < salas.length; i++) {
            resultado += (i + 1) + ". " + salas[i].toString() + "\n";
        }
        return resultado;
    }
}
