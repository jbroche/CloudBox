/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudBox;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jlzirani
 */
public class CloudFile implements Serializable {
    
    private User author;
    private String nameFile;
    private Date date;

    public CloudFile(User author, String nameFile) {
        this.author = author;
        this.nameFile = nameFile;
    }
        
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setAuthor(User author) {
        this.author = author;
    }
    
    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
    
    public User getAuthor() {
        return this.author;
    }
    
    public String getNameFile() {
        return this.nameFile;
    }
    

    
}
