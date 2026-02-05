package ejercicios;

public class Ejercicio2_Persona {

    private String nombre;
    private int edad;

    public Ejercicio2_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // equals()
    // Se sobrescribe para que dos personas se consideren iguales
    // cuando tienen el mismo nombre y la misma edad.
    @Override
    public boolean equals(Object obj) {

        // Si es el mismo objeto en memoria
        if (this == obj) return true;

        // Si el objeto no es de tipo Persona
        if (!(obj instanceof Ejercicio2_Persona)) return false;

        Ejercicio2_Persona p = (Ejercicio2_Persona) obj;

        return nombre.equals(p.nombre) && edad == p.edad;
    }

    // hashCode()
    // Siempre debe sobrescribirse cuando se redefine equals().
    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }
}
