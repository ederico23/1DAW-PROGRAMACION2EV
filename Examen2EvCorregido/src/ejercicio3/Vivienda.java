package ejercicio3;

/**
 * Clase abstracta Vivienda: clase base para todos los tipos de vivienda.
 *
 * Pistas del examen respondidas:
 * - "¿Qué tendrá que tener la clase abstracta?" → La palabra clave 'abstract'.
 *   Una clase abstracta NO se puede instanciar directamente; sirve como plantilla.
 *
 * - "El atributo precio metro cuadrado es COMÚN a todas las viviendas. ¿Qué significa?"
 *   → Significa que es un atributo de CLASE, no de instancia.
 *   → Se declara con 'static': existe uno solo compartido por todos los objetos.
 *
 * - "¿La interfaz la implemento en la clase padre o en las clases hijas? ¿Por qué?"
 *   → La declaramos en la clase padre (Vivienda implements Valorable), pero como
 *     Vivienda es abstracta, NO está obligada a implementar calcularPrecio().
 *     Las clases hijas concretas (Piso, Unifamiliar) SÍ deben implementarlo.
 *     Esto obliga a que TODAS las clases que hereden de Vivienda implementen la interfaz.
 */
public abstract class Vivienda implements Valorable {

    // Atributos de instancia: cada vivienda tiene los suyos propios
    private String direccion;
    private double superficie;
    private int habitaciones;

    // Atributo ESTÁTICO (de clase): compartido por TODAS las viviendas
    // "static" = existe una sola copia, no una por objeto
    // "private" = solo se accede mediante getter/setter
    private static double precioMetroCuadrado = 1500.0; // Valor inicial por defecto

    /**
     * Constructor de la superclase.
     * Las clases hijas lo invocarán con super(...)
     */
    public Vivienda(String direccion, double superficie, int habitaciones) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.habitaciones = habitaciones;
    }

    // ─── Getters de instancia ───────────────────────────────────────────────────

    public String getDireccion() {
        return direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    // ─── Getter y setter ESTÁTICOS del precio por metro cuadrado ───────────────
    // Son static porque el atributo es static: se llaman con Vivienda.getPrecioMetroCuadrado()

    public static double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public static void setPrecioMetroCuadrado(double nuevoPrecio) {
        precioMetroCuadrado = nuevoPrecio;
    }

    // calcularPrecio() NO se implementa aquí porque Vivienda es abstracta.
    // Cada subclase (Piso, Unifamiliar) lo implementará a su manera.
    // (Heredado de la interface Valorable)
}
