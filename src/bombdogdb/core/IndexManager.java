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
public class IndexManager {
    public IndexManager(String index_name) {
        
    }
    
    public boolean createIndex() {
        return true;
    }
    
    public static IndexManager createIndex(String row) {
        return null;
    }
    
    public IndexManager readIndex(long index_id) {
        return null;
    }
    
    public boolean updateIndex(long index_id,String new_val) {
        return true;
    }
    
    public boolean deleteIndex(long index_id) {
        return true;
    }
    
    public String search(String busco) {
        return null;
    }
    
    public ArrayList<String> searchAll(String busco) {
        return null;
    }
}
