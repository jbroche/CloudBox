package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Server extends UnicastRemoteObject implements FileInterfaceForRessource {

    private List<FileSrv> listFile;
    
    public Server() throws RemoteException {
        this.listFile = new ArrayList<FileSrv>();
    }
    
    public void addFile(FileSrv file) throws RemoteException {
        listFile.add(file);
    }
    
    public List<FileSrv> getAllFile() throws RemoteException {
        return listFile;
    }
}
