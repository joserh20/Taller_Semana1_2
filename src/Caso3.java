public class Caso3 {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SOBRECARGA ---");
        Operacion op = new Operacion();
        
        // El sistema decide qué método usar según los datos que le envías
        System.out.println("Suma de 2 enteros (5 + 10): " + op.sumar(5, 10));
        System.out.println("Suma de 2 decimales (5.5 + 2.3): " + op.sumar(5.5, 2.3));
        System.out.println("Suma de 3 enteros (1 + 2 + 3): " + op.sumar(1, 2, 3));
    }
}

class Operacion {
    // Mismo nombre de método, diferentes parámetros (Sobrecarga)
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}