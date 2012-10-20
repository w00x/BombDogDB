/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

import bombdogdb.core.exceptions.ContenedorNotExistException;
import bombdogdb.core.exceptions.ErrorIOInstanceException;
import bombdogdb.core.exceptions.PermissionException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author w00x
 */
public class DBManager {
    private String db_name;
    private String pat_base = "";
    private File db_dir;
    private String actual_dir = System.getProperty("user.dir")+"/dbs/";
    
    public DBManager(String db_name) {
        this.db_name = db_name;
        this.db_dir = new File(this.actual_dir+this.db_name); 
    }
    
    public void setDBName(String db_name) {
        this.db_name = db_name;
    }
    
    public String getDBName() {
        return this.db_name;
    }
    
    public void createDB() throws PermissionException {
        try {
            this.db_dir.mkdir();
        }
        catch(SecurityException ex) {
            throw new PermissionException("Violacion de permisos");
        }
    }
    
    public static DBManager getInstance(String table) {
        return new DBManager(table);
    }
    
    public void renameDB(String new_db) throws PermissionException, ContenedorNotExistException {
        try {
            this.db_dir.renameTo(new File(this.actual_dir+new_db));
        }
        catch(SecurityException $ex) {
            throw new PermissionException("Violacion de permisos");
        }
        catch(NullPointerException $ex) {
            throw new ContenedorNotExistException("Contenedor de DB no existe");
        }
    }
    
    public boolean deleteDB() throws ErrorIOInstanceException {
        try {
            FileUtils.deleteDirectory(this.db_dir);
            return true;
        }
        catch(IOException ex) {
            throw new ErrorIOInstanceException("Error al eliminar instancia");
        }
    }
}
