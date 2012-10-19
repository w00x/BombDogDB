/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core;

/**
 *
 * @author w00x
 */
public class WhereJoin {
    public static int EQUAL = 1;
    public static int MAY = 2;
    public static int MIN = 3;
    public static int MAY_QUAL = 4;
    public static int MIN_QUAL = 5;
    
    private String col_one;
    private int comparator;
    private String col_two;
    
    public WhereJoin() {
        
    }
    
    public WhereJoin(String col_one,int comparator,String col_two) {
        this.col_one = col_one;
        this.comparator = comparator;
        this.col_two = col_two;
    }

    /**
     * @return the col_one
     */
    public String getCol_one() {
        return col_one;
    }

    /**
     * @param col_one the col_one to set
     */
    public void setCol_one(String col_one) {
        this.col_one = col_one;
    }

    /**
     * @return the comparator
     */
    public int getComparator() {
        return comparator;
    }

    /**
     * @param comparator the comparator to set
     */
    public void setComparator(int comparator) {
        this.comparator = comparator;
    }

    /**
     * @return the col_two
     */
    public String getCol_two() {
        return col_two;
    }

    /**
     * @param col_two the col_two to set
     */
    public void setCol_two(String col_two) {
        this.col_two = col_two;
    }
}
