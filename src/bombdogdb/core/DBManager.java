/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

/**
 *
 * @author w00x
 */
public class DBManager {
    public DBManager(String db_name) {
        
    }
    
    public boolean createDB() {
        return true;
    }
    
    public static DBManager createDB(String table) {
        return null;
    }
    
    public boolean renameDB(long index_id,String new_val) {
        return true;
    }
    
    public boolean deleteDB(long index_id) {
        return true;
    }
    
    public String getDBName() {
        return "";
    }
}
