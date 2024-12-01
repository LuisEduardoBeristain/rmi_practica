import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteCalculadora {
    public static void main(String[] args) {
        try {
            // Obtener el registro del servidor
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            
            // Buscar el servicio por su nombre
            ICalculadora calc = (ICalculadora) registry.lookup("CalculadoraService");
            
            // Realizar algunas operaciones de prueba
            System.out.println("Suma: " + calc.sumar(5, 3));
            System.out.println("Resta: " + calc.restar(10, 4));
            System.out.println("Multiplicación: " + calc.multiplicar(6, 2));
            System.out.println("División: " + calc.dividir(15, 3));
            
        } catch (Exception e) {
            System.err.println("Error en cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
