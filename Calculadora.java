import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {
    
    public Calculadora() throws RemoteException {
        super();
    }
    
    public double sumar(double a, double b) throws RemoteException {
        return a + b;
    }
    
    public double restar(double a, double b) throws RemoteException {
        return a - b;
    }
    
    public double multiplicar(double a, double b) throws RemoteException {
        return a * b;
    }
    
    public double dividir(double a, double b) throws RemoteException {
        if (b != 0) {
            return a / b;
        } else {
            throw new RemoteException("No se puede dividir por cero");
        }
    }
}
