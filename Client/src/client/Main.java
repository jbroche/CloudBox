package client;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import outils.ConnectionDialog;
import server.FileInterfaceForRessource;
import server.Server;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        ConnectionDialog<FileInterfaceForRessource> dialog =
                new ConnectionDialog<FileInterfaceForRessource>(new JFrame(), true);
        dialog.setNomRessource("Box");
        dialog.setVisible(true);
        
        FileInterfaceForRessource ressource = dialog.getRessource();
        
        if (dialog.getRessource() == null) {
            JOptionPane.showMessageDialog(new JFrame(), "erreur", "Erreur de ressource",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                FrameAdmFile frame = new FrameAdmFile(dialog.getRessource());
                frame.setVisible(true);
                frame.setTitle("Administrate your file.");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
