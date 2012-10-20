/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core.exceptions;

/**
 *
 * @author w00x
 */
public class PermissionException extends Exception {

    /**
     * Creates a new instance of
     * <code>PermissionDBException</code> without detail message.
     */
    public PermissionException() {
    }

    /**
     * Constructs an instance of
     * <code>PermissionDBException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PermissionException(String msg) {
        super(msg);
    }
}
