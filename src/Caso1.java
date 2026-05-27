
import java.util.Scanner;

public class Caso1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("--- CALCULADORA CON MÉTODOS ---");
        System.out.print("Ingresa el primer número: ");
        double num1 = lector.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = lector.nextDouble();
        
        System.out.print("Elige la operación (+, -, *, /): ");
        char operacion = lector.next().charAt(0);
        
        switch (operacion) {
            case '+':
                System.out.println("Resultado de la suma: " + sumar(num1, num2));
                break;
            case '-':
                System.out.println("Resultado de la resta: " + restar(num1, num2));
                break;
            case '*':
                System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Error: Operación no válida.");
                break;
        }
        
        lector.close();
    }

    // Métodos estáticos para las operaciones
    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
}