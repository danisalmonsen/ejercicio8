public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Daniela");
        persona1.setEdad(36);
        persona1.setTelefono("33333");
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());

    }
}
class Persona{
    //Parametros de la clase
    private int edad;
    private String nombre;
    private String telefono;

    //Metodos de la clase
    //Seters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Geters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}