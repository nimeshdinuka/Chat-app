
package lk.ijse.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class LogServiceImpl extends UnicastRemoteObject 
        implements LogService{
    
    public LogServiceImpl() throws RemoteException{
        
    }
    
    public void log(String message) throws RemoteException{
        System.out.println(message);
    }
    
}
