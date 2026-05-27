public class Caso4 {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE VARIABLE ESTÁTICA ---");
        
        // Verificamos el contador antes de crear cualquier objeto
        System.out.println("Objetos al inicio: " + Contador.cantidadObjetos);
        
        // Creamos el primer objeto
        Contador obj1 = new Contador();
        System.out.println("Objetos después de crear obj1: " + Contador.cantidadObjetos);
        
        // Creamos dos objetos más
        Contador obj2 = new Contador();
        Contador obj3 = new Contador();
        
        // Mostramos el total final
        System.out.println("Objetos totales creados: " + Contador.cantidadObjetos);
    }
}

// La clase Contador va aquí mismo, debajo y sin la palabra 'public'
class Contador {
    public static int cantidadObjetos = 0;

    public Contador() {
        cantidadObjetos++;
    }
}