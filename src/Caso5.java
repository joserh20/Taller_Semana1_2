import java.util.ArrayList;
import java.util.Scanner;

public class Caso5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        int cantidad = 0;

        // Validar cantidad de estudiantes
        try {

            System.out.print("¿Cuantos estudiantes desea ingresar?: ");
            cantidad = Integer.parseInt(sc.nextLine());

        } catch (Exception e) {

            System.out.println("Error: Debe ingresar un numero entero.");
            return;
        }

        // Ingresar nombres
        for (int i = 0; i < cantidad; i++) {

            try {

                System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                String nombre = sc.nextLine();

                // Error si esta vacio
                if (nombre.trim().isEmpty()) {
                    throw new Exception("No se permiten espacios vacios.");
                }

                // Error si contiene numeros
                if (nombre.matches(".*\\d.*")) {
                    throw new Exception("El nombre no puede contener numeros.");
                }

                estudiantes.add(nombre);

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
                i--; // vuelve a pedir el nombre
            }
        }

        // Mostrar lista completa
        System.out.println("\nLista de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        sc.close();
    }
}
