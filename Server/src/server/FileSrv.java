/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class FileSrv implements Serializable {
    
    private String author;
    private String nameFile;
    
    public FileSrv(String author, String nameFile) {
        this.author = author;
        this.nameFile = nameFile;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getNameFile() {
        return this.nameFile;
    }
    
}
