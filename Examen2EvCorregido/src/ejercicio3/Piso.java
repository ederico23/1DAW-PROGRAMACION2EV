package ejercicio3;

/**
 * Clase Piso: hereda de Vivienda e implementa calcularPrecio().
 *
 * Atributos propios: altura (planta en la que está) y ascensor (boolean).
 *
 * Cálculo de precio:
 * → precio base = superficie × precioMetroCuadrado
 * → incremento  = 1% por cada planta de altura
 * → precio final = precioBase + (precioBase × altura × 0.01)
 *
 * Ejemplo: piso en planta 7 con 80m² a 1500€/m²:
 * → base = 80 × 1500 = 120.000€
 * → incremento = 120.000 × 7 × 0.01 = 8.400€
 * → total = 128.400€
 */
public class Piso extends Vivienda {

    // Atributos propios de Piso
    private int altura;       // Planta en la que se encuentra el piso
    private boolean ascensor; // ¿Tiene ascensor?

    /**
     * Constructor de Piso.
     * Llama con super() al constructor de Vivienda para inicializar los atributos comunes.
     */
    public Piso(String direccion, double superficie, int habitaciones,
                int altura, boolean ascensor) {
        // super() invoca el constructor de la clase padre (Vivienda)
        super(direccion, superficie, habitaciones);
        this.altura = altura;
        this.ascensor = ascensor;
    }

    // Getters propios
    public int getAltura() {
        return altura;
    }

    public boolean tieneAscensor() {
        return ascensor;
    }

    /**
     * Implementación de calcularPrecio() de la interface Valorable.
     * Un 1% de incremento por cada planta de altura.
     */
    @Override
    public double calcularPrecio() {
        // Precio base: metros cuadrados × precio del m²
        double precioBase = getSuperficie() * Vivienda.getPrecioMetroCuadrado();

        // Incremento: 1% por cada planta (altura × 1% = altura × 0.01)
        double incremento = precioBase * altura * 0.01;

        return precioBase + incremento;
    }

    /**
     * toString() para mostrar los datos del piso con el formato pedido en el examen.
     */
    @Override
    public String toString() {
        return "Vivienda Tipo: Piso\n" +
               "Dirección: " + getDireccion() + "\n" +
               "Habitaciones: " + getHabitaciones() + "\n" +
               "Superficie: " + getSuperficie() + "\n" +
               "Altura: " + altura + "\n" +
               "Ascensor: " + (ascensor ? "Si" : "No") + "\n" +
               "Precio: " + String.format("%.2f", calcularPrecio()) + "€";
    }
}