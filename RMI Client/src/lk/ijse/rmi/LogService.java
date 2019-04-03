
package lk.ijse.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface LogService extends Remote{
    
    public void log(String message) throws RemoteException;
    
}
