/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author w00x
 */
public class ColumnManager {
    public ColumnManager(String colum_name) {
        
    }
    
    public boolean createRow() {
        return true;
    }
    
    public static ColumnManager createColumn(String row) {
        return null;
    }
    
    public ColumnManager readRow(long raw_id) {
        return null;
    }
    
    public boolean updateRow(long raw_id,String new_val) {
        return true;
    }
    
    public boolean deleteRow(long raw_id) {
        return true;
    }
    
    public ColumnManager bruteSearch(String busco) {
        return null;
    }
    
    public ArrayList<String> bruteSearchAll(String busco) {
        return null;
    }
}
