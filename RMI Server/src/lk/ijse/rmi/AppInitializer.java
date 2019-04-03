
package lk.ijse.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class AppInitializer {
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry rmiRegistry = LocateRegistry.createRegistry(5050);
        rmiRegistry.bind("logging", new LogServiceImpl());
        System.out.println("Server has been started");
    }
    
}
