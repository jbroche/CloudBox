/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author user
 */
public interface FileInterfaceForRessource extends Remote {
    
    public void addFile(FileSrv file) throws RemoteException;
    public List<FileSrv> getAllFile() throws RemoteException;
}
