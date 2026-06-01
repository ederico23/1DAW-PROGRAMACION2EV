package ejercicio3;

/**
 * Interface Valorable: obliga a implementar el método calcularPrecio().
 *
 * Pista del examen: "¿Qué es lo único que tendrá que tener este método? ¿Qué modificadores tendrá?"
 * → Un método de interfaz es por defecto public y abstract (aunque no hace falta escribirlo).
 *   Solo se declara la firma, sin cuerpo. Cada clase que implemente la interfaz
 *   debe proporcionar su propia implementación del método.
 */
public interface Valorable {

    // Método que devuelve el precio calculado de la vivienda.
    // No tiene cuerpo aquí: lo implementará cada clase concreta (Piso, Unifamiliar).
    double calcularPrecio();
}