package ejercicio2;

public class SalaCine {
    
    // static: pertenece a la clase, cuenta cuántas salas se han creado
    private static int numeroSalas = 0;
    
    private String nombreSala;
    private int numeroFilas;
    private int butacasFila;
    private boolean[][] mapaSala;
    private String pelicula;
    
    // Constructor: solo recibe pelicula, filas y butacas
    // el nombre se genera automáticamente
    public SalaCine(String pelicula, int numeroFilas, int butacasFila) {
        numeroSalas++;                          // incrementamos el contador estático
        this.nombreSala = "sala" + numeroSalas; // sala1, sala2, sala3...
        this.pelicula = pelicula;
        this.numeroFilas = numeroFilas;
        this.butacasFila = butacasFila;
        this.mapaSala = new boolean[numeroFilas][butacasFila];
        reiniciaSala(); // inicializa todo a false
    }
    
    // Getters necesarios
    public String getNombreSala() { return nombreSala; }
    public String getPelicula() { return pelicula; }
    public void setPelicula(String pelicula) { this.pelicula = pelicula; }
    public boolean[][] getMapaSala() { return mapaSala; }
    public int getNumeroFilas() { return numeroFilas; }
    public int getButacasFila() { return butacasFila; }
    
    // Muestra el mapa: 'x' ocupada, '-' libre
    // Es el ÚNICO método que imprime en esta clase
    public void muestraSala() {
        for (int i = 0; i < mapaSala.length; i++) {
            for (int j = 0; j < mapaSala[i].length; j++) {
                System.out.print(mapaSala[i][j] ? "x " : "- ");
            }
            System.out.println(); // salto de línea al acabar cada fila
        }
    }
    
    // Pone todas las butacas a false (libres)
    public void reiniciaSala() {
        for (int i = 0; i < mapaSala.length; i++) {
            for (int j = 0; j < mapaSala[i].length; j++) {
                mapaSala[i][j] = false;
            }
        }
    }
    
    // Compra una butaca. Devuelve true si se pudo comprar
    public boolean comprarEntrada(int fila, int butaca) {
        // comprobamos que fila y butaca estén dentro del rango
        if (fila < 0 || fila >= numeroFilas || butaca < 0 || butaca >= butacasFila) {
            return false;
        }
        // comprobamos que la butaca no esté ya ocupada
        if (mapaSala[fila][butaca]) {
            return false;
        }
        // si llegamos aquí, la compramos
        mapaSala[fila][butaca] = true;
        return true;
    }
    
    // Calcula la recaudación: butacas ocupadas * precio de Cine
    public double recaudacion() {
        int ocupadas = 0;
        for (int i = 0; i < mapaSala.length; i++) {
            for (int j = 0; j < mapaSala[i].length; j++) {
                if (mapaSala[i][j]) ocupadas++;
            }
        }
        return ocupadas * Cine.getPrecioEntrada(); // accedemos al static de Cine
    }
    
    // toString: solo nombre y película, sin imprimir el array
    @Override
    public String toString() {
        return "Sala: " + nombreSala + " | Película: " + pelicula;
    }
}