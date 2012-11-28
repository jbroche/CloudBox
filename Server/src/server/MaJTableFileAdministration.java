package server;

import java.util.Collection;
import outils.MaJTable;
import outils.MonModele;

public class MaJTableFileAdministration extends MaJTable<FileSrv> {
    
    private Collection<FileSrv> data;
    
    private String[] titres = {"Author", "Name"};
    private String[] methodes = { "getAuthor", "getNameFile"};

    private int[] largeurs = {50, 150};

    public MaJTableFileAdministration() {
        super();
    }

    public MaJTableFileAdministration(Collection<FileSrv> data) {
        super();
        setData(data);
    }

    public void setPresentation(String[] titres, String[] methodes,
                                                            int[] largeurs) {
        this.titres=titres;
        this.methodes=methodes;
        this.largeurs=largeurs;
        if (data!=null) {
            setData(data);
        }
    }

    public void setData(Collection<FileSrv> col) {
        this.data=col;
        setModel(new MonModele<FileSrv>(col,titres,methodes));
        setColumnWidth(largeurs);
    }
    
}
