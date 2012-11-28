package server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        System.setSecurityManager(new RMISecurityManager());
        
        try {
            FileInterfaceForRessource srv = new Server();
            FileSrv file1 = new FileSrv("Jimmy", "Sys");
            FileSrv file2 = new FileSrv("Xavier", "TAI");
            srv.addFile(file1);
            srv.addFile(file2);
            Naming.rebind("Box", srv);
            
            FrameSrv frame = new FrameSrv(srv);
            frame.setVisible(true);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

