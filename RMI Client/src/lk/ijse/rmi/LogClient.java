
package lk.ijse.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class LogClient {
    
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        
         LogService logService = (LogService) Naming.lookup("rmi://localhost:5050/logging");
         logService.log("IJSE");
         

    }
    
}
