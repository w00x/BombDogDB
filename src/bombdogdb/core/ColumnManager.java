/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

import bombdogdb.core.data.DataRow;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author w00x
 */
public class ColumnManager {
    private TableManager table;
    private String column_name;
    private String actual_dir = System.getProperty("user.dir")+"/dbs/";
    private File column;
    
    public ColumnManager(TableManager table, String colum_name) {
        this.table = table;
        this.column_name = colum_name;
        this.column = new File(actual_dir+table.getDBManager().getDBName()+"/"+table.getTableName()+"/columns/"+this.column_name);
    }
    
    public boolean createColumn(boolean sobre_escribir) {
        return true;
    }
    
    public boolean deleteColumn() {
        return true;
    }
    
    public boolean updateColumName(String new_name) {
        return true;
    }
    
    public static ColumnManager getInstance(TableManager table, String row) {
        return new ColumnManager(table, row);
    }
    
    public DataRow readRow(long raw_id) {
        return null;
    }
    
    public boolean updateRow(DataRow row) {
        return true;
    }
    
    public boolean deleteRow(DataRow row) {
        return true;
    }
    
    public DataRow bruteSearch(String busco) {
        return null;
    }
    
    public ArrayList<DataRow> bruteSearchAll(String busco) {
        return null;
    }
}
