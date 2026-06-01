package ejercicio1;

/**
 * Excepción propia que extiende IllegalArgumentException.
 * Se lanza cuando una matrícula no cumple el formato: 4 dígitos + 3 letras mayúsculas.
 *
 * La pista del examen preguntaba: "¿Es posible que alguna clase padre ya tenga ese atributo?"
 * → Sí, IllegalArgumentException hereda de RuntimeException que hereda de Exception,
 *   la cual ya tiene el atributo "message" y un constructor que lo recibe.
 *
 * "¿Qué operador debo invocar para utilizar elementos de clases padres?"
 * → super(mensaje) llama al constructor del padre, que guarda el mensaje internamente.
 */
public class MatriculaErroneaException extends IllegalArgumentException {

    // Constructor que recibe la matrícula incorrecta y construye el mensaje de error.
    // Usamos super() para pasarle el mensaje al constructor de IllegalArgumentException,
    // que a su vez lo pasa a Exception, donde se almacena en el atributo "message".
    public MatriculaErroneaException(String matriculaErronea) {
        super("La matrícula " + matriculaErronea + " no es válida");
    }
}