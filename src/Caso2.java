public class Caso2 {
    public static void main(String[] args) {
        System.out.println("--- DATOS DE PERSONAS ---");
        
        // Creación de los 2 objetos
        Persona persona1 = new Persona("Carlos", 30);
        Persona persona2 = new Persona("Lucía", 25);
        
        // Mostrar la información
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}

class Persona {
    private String nombre;
    private int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años.");
    }
}