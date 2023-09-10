public class PersonaConEdad extends Persona{

    private int edad;

    public int getEdad() {
        return edad;
    }

    public PersonaConEdad(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }
}
