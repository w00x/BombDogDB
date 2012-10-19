/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

import bombdogdb.core.data.DataTable;
import java.util.ArrayList;

/**
 *
 * @author w00x
 */
public class TableManager {
    private ArrayList<ColumnManager> columnList;
    private String tableName;
    
    public TableManager(String table_name) {
        
    }
    
    public boolean createTable() {
        return true;
    }
    
    public static TableManager createTable(String table) {
        return null;
    }
    
    public boolean renameTable(long index_id,String new_val) {
        return true;
    }
    
    public boolean deleteTable(long index_id) {
        return true;
    }
    
    public String getTableName() {
        return this.tableName;
    }
    
    public DataTable select(String columns[]) {
        return null;
    }
    
    public void setTableName(String table_name) {
        this.tableName = table_name;
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

    /**
     * @param columnList the columnList to set
     */
    public void setColumnList(ArrayList<ColumnManager> columnList) {
        this.columnList = columnList;
    }
}
