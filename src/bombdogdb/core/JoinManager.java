/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

/**
 *
 * @author w00x
 */
public class JoinManager {
    private String join_table;
    private String join_col;
    private String table_col;
    
    public JoinManager() {
        
    }
    
    public JoinManager(String join_table,String join_col,String table_col) {
        this.join_table = join_table;
        this.join_col = join_col;
        this.table_col = table_col;
    }

    /**
     * @return the join_table
     */
    public String getJoin_table() {
        return join_table;
    }

    /**
     * @param join_table the join_table to set
     */
    public void setJoin_table(String join_table) {
        this.join_table = join_table;
    }

    /**
     * @return the join_col
     */
    public String getJoin_col() {
        return join_col;
    }

    /**
     * @param join_col the join_col to set
     */
    public void setJoin_col(String join_col) {
        this.join_col = join_col;
    }

    /**
     * @return the table_col
     */
    public String getTable_col() {
        return table_col;
    }

    /**
     * @param table_col the table_col to set
     */
    public void setTable_col(String table_col) {
        this.table_col = table_col;
    }
}
