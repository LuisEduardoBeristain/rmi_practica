import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorCalculadora {
    public static void main(String[] args) {
        try {
            // Crear el registro RMI en el puerto 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            
            // Crear la instancia de la calculadora
            Calculadora calc = new Calculadora();
            
            // Registrar el servicio con un nombre
            registry.rebind("CalculadoraService", calc);
            
            System.out.println("Servidor calculadora iniciado...");
        } catch (Exception e) {
            System.err.println("Error en servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
