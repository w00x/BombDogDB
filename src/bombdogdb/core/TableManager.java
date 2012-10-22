/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

import bombdogdb.core.data.DataTable;
import bombdogdb.core.exceptions.ContenedorNotExistException;
import bombdogdb.core.exceptions.ErrorIOInstanceException;
import bombdogdb.core.exceptions.PermissionException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author w00x
 */
public class TableManager {
    private ArrayList<ColumnManager> columnList;
    private String table_name;
    private DBManager db_manager;
    private String actual_dir = System.getProperty("user.dir")+"/dbs/";
    private File table_dir;
    
    public TableManager(DBManager db_manager,String table_name) {
        this.table_name = table_name;
        this.db_manager = db_manager;
        this.table_dir = new File(this.actual_dir+this.db_manager.getDBName()+"/"+this.table_name); 
    }
    
    public void createTable() throws PermissionException, ErrorIOInstanceException {
        try {
            this.table_dir.mkdir();
            new File(this.table_dir.getAbsolutePath()+"/columns").mkdir();
            new File(this.table_dir.getAbsolutePath()+"/index").mkdir();
            new File(this.table_dir.getAbsolutePath()+"/config.yml").createNewFile();
        }
        catch(SecurityException ex) {
            throw new PermissionException("Violacion de permisos");
        }
        catch(IOException ex) {
            throw new ErrorIOInstanceException("Error al crear instancia");
        }
    }
    
    public static TableManager getInstance(DBManager db_manager,String table_name) {
        return new TableManager(db_manager,table_name);
    }
    
    public void renameTable(String new_table_name) throws PermissionException, ContenedorNotExistException {
        try {
            this.table_dir.renameTo(new File(this.actual_dir+this.db_manager.getDBName()+"/"+new_table_name));
        }
        catch(SecurityException $ex) {
            throw new PermissionException("Violacion de permisos");
        }
        catch(NullPointerException $ex) {
            throw new ContenedorNotExistException("Contenedor de DB no existe");
        }
    }
    
    public boolean deleteTable() throws ErrorIOInstanceException {
        try {
            FileUtils.deleteDirectory(this.table_dir);
            return true;
        }
        catch(IOException ex) {
            throw new ErrorIOInstanceException("Error al eliminar instancia");
        }
    }
    
    public String getTableName() {
        return this.table_name;
    }
    
    public DataTable select(String columns[]) {
        return null;
    }
    
    public void setTableName(String table_name) {
        this.table_name = table_name;
    }
    
    public DBManager getDBManager() {
        return this.db_manager;
    }
    
    public void where(ArrayList<WhereJoin> where_simple) {
        
    }
    
    public void setOrder(String column) {
        
    }
    
    public void setLimit(String limit, int count) {
        
    }
    
    public void setJoin(ArrayList<JoinManager> join) {
        
    }

    /**
     * @return the columnList
     */
    public ArrayList<ColumnManager> getColumnList() {
        return columnList;
    }

    public boolean createColumn(String name) {
        return true;
    }
    
    public ColumnManager getColumn(String name) {
        return null;
    }
}
