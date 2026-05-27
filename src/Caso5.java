import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Caso5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<String> listaEstudiantes = new ArrayList<>();
        
        System.out.println("--- REGISTRO DE ESTUDIANTES ---");
        
        try {
            System.out.print("¿Cuántos estudiantes deseas registrar?: ");
            int cantidad = lector.nextInt();
            lector.nextLine(); // Limpiar el buffer
            
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
                String nombre = lector.nextLine();
                listaEstudiantes.add(nombre);
            }
            
            System.out.println("\n--- Lista Completa ---");
            for (String estudiante : listaEstudiantes) {
                System.out.println("- " + estudiante);
            }
            
        } catch (InputMismatchException e) {
            // Captura el error si el usuario escribe letras en lugar de un número entero
            System.out.println("Error: Ingresaste un dato inválido. Debías ingresar un número entero.");
        } finally {
            lector.close();
        }
    }
}