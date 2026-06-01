package ejercicio3;

/**
 * Clase Unifamiliar: hereda de Vivienda e implementa calcularPrecio().
 *
 * Atributo propio: jardin (boolean).
 *
 * Cálculo de precio:
 * → precio base = superficie × precioMetroCuadrado
 * → porcentajeUnifamiliar es ESTÁTICO (común a todas las unifamiliares), valor inicial 11%
 * → Si tiene jardín, el porcentaje sube un 5% más (11% + 5% = 16%)
 * → precio final = precioBase + (precioBase × porcentaje / 100)
 */
public class Unifamiliar extends Vivienda {

    // Atributo propio de Unifamiliar
    private boolean jardin;

    // Porcentaje ESTÁTICO (común a todas las unifamiliares), valor inicial 11%
    // La aplicación debe permitir cambiar este valor → necesita getter y setter static
    private static double porcentajeUnifamiliar = 11.0;

    /**
     * Constructor de Unifamiliar.
     * Llama con super() al constructor de Vivienda.
     */
    public Unifamiliar(String direccion, double superficie, int habitaciones, boolean jardin) {
        super(direccion, superficie, habitaciones);
        this.jardin = jardin;
    }

    // Getter propio
    public boolean tieneJardin() {
        return jardin;
    }

    // Getter y setter ESTÁTICOS del porcentaje unifamiliar
    public static double getPorcentajeUnifamiliar() {
        return porcentajeUnifamiliar;
    }

    public static void setPorcentajeUnifamiliar(double nuevoPorcentaje) {
        porcentajeUnifamiliar = nuevoPorcentaje;
    }

    /**
     * Implementación de calcularPrecio() de la interface Valorable.
     * Se aplica el porcentaje base y, si tiene jardín, se suma un 5% adicional.
     */
    @Override
    public double calcularPrecio() {
        // Precio base
        double precioBase = getSuperficie() * Vivienda.getPrecioMetroCuadrado();

        // Porcentaje a aplicar: base (11%) + 5% extra si tiene jardín
        double porcentajeTotal = porcentajeUnifamiliar + (jardin ? 5.0 : 0.0);

        // Incremento sobre el precio base
        double incremento = precioBase * porcentajeTotal / 100.0;

        return precioBase + incremento;
    }

    /**
     * toString() con el formato pedido en el examen.
     */
    @Override
    public String toString() {
        return "Vivienda Tipo: Unifamiliar\n" +
               "Dirección: " + getDireccion() + "\n" +
               "Habitaciones: " + getHabitaciones() + "\n" +
               "Superficie: " + getSuperficie() + "\n" +
               "Jardín: " + (jardin ? "Si" : "No") + "\n" +
               "Precio: " + String.format("%.2f", calcularPrecio()) + "€";
    }
}