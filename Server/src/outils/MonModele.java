package outils;
// Remplacez ici par votre package
// Note à pbt, ne pas modifier, c'est le source de l'énoncé

import java.lang.reflect.Method;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 * Classe étendant AbstractTableModel nécessaire à la classe MaJTable
 * @autor Broché Jimmy
 */

public class MonModele<T> extends AbstractTableModel {

    Vector<T> data;
    String[] titresColonnes;
    String[] methodNames;

    /**
     * Construit MonModele
     * @param data Collection des données de type T
     * @param titresCol titre des colonnes
     * @param methodNames nom des getters à utiliser pour l'affichage
     */
    
    public MonModele(Collection<T> data, String[] titresCol,
            String[] methodNames) {
        this.data = new Vector<T>(data);
        this.titresColonnes = titresCol;
        this.methodNames = methodNames;
    }

    /**
     * retourne le nombre de lignes du modèle
     * @return
     */
    public int getRowCount() {
        return data.size();
    }

    /**
     * retourne le nombre de colonnes du modèle
     * @return
     */
    public int getColumnCount() {
        return titresColonnes.length;
    }

    /**
     * retourne la valeur affichée en colonne rowINd et en colonne columnIndex
     * @param rowIndex
     * @param columnIndex
     * @return
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            T o = data.get(rowIndex);
            Method m = o.getClass().getMethod(methodNames[columnIndex]);
            return m.invoke(o);
        } catch (Exception ex) {
            // sans objet
            ex.printStackTrace();
            return null;
        } 
    }

    @Override
    public String getColumnName(int col) {
        return titresColonnes[col];
    }

    /**
     * retourne l'objet pr�sent� en ligne ind
     * @param ind
     * @return
     */
    public T getObject(int ind){
        return data.get(ind);
    }    
} 
