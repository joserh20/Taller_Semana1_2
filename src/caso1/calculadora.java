package caso1;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2, resultado;
		int opc;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***CALCULADORA***");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("*****************");
        System.out.print("INGRESE EL NUMERO DE LA OPCION: ");
        opc = scanner.nextInt();
       
	System.out.print("Ingrese el primer numero: ");
		n1 =scanner.nextDouble();
    System.out.print("Ingrese el segundo numero: ");
		n2 =scanner.nextDouble();
	
	
	   switch (opc) {
       case 1:
           resultado = sumar(n1, n2);
           System.out.println("Resultado: "  + resultado);
           break;
       case 2:
           resultado = restar(n1, n2);
           System.out.println("Resultado: " + resultado);
           break;
       case 3:
           resultado = multiplicar(n1, n2);
           System.out.println("Resultado: " + resultado);
           break;
       case 4:
          
           if (n2 == 0) {
               System.out.println("Error: No se puede dividir por cero.");
           } else {
               resultado = dividir(n1, n2);
               System.out.println("Resultado: " + resultado);
           }
           break;
         
       default:
           System.out.println("\n Opción no válida. Ejecute el programa nuevamente.");
        
   }
	 
   scanner.close();

	}
	
	
   public static double sumar(double a, double b) {
       return a + b;
   }

   public static double restar(double a, double b) {
       return a - b;
   }

   public static double multiplicar(double a, double b) {
       return a * b;
   }

   public static double dividir(double a, double b) {
       return a / b;
   }
	
	
}