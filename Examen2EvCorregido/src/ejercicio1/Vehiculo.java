package ejercicio1;

/**
 * Clase Vehículo con atributos marca, color y matrícula.
 *
 * La pista preguntaba: "¿En qué método de las clases construimos los objetos?"
 * → En el CONSTRUCTOR. Es ahí donde validamos la matrícula y lanzamos la excepción.
 *
 * El formato válido de matrícula es: 4 dígitos seguidos de 3 letras mayúsculas.
 * Ejemplo válido: "1234ABC"
 * Usamos una expresión regular (regex) para validarlo: [0-9]{4}[A-Z]{3}
 */
public class Vehiculo {

    // Atributos de la clase
    private String marca;
    private String color;
    private String matricula;

    /**
     * Constructor de Vehículo.
     * Valida la matrícula con una expresión regular antes de asignarla.
     * Si no es válida, lanza MatriculaErroneaException.
     *
     * La excepción es de tipo RuntimeException (no checked), por lo que
     * no es obligatorio declarar throws, pero la lanzamos igualmente.
     */
    public Vehiculo(String marca, String color, String matricula) {
        this.marca = marca;
        this.color = color;

        // Validamos la matrícula con regex:
        // [0-9]{4} → exactamente 4 dígitos
        // [A-Z]{3} → exactamente 3 letras mayúsculas
        // matches() comprueba que TODA la cadena cumpla el patrón
        if (!matricula.matches("[0-9]{4}[A-Z]{3}")) {
            // Si la matrícula no es válida, lanzamos nuestra excepción propia
            throw new MatriculaErroneaException(matricula);
        }

        this.matricula = matricula;
    }

    // Getters para acceder a los atributos desde fuera de la clase
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    // toString para representar el vehículo como texto
    @Override
    public String toString() {
        return "El vehículo " + marca + ", " + color + ", " + matricula + ", se ha creado correctamente";
    }
}
