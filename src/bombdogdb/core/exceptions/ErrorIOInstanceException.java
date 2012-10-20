/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core.exceptions;

/**
 *
 * @author w00x
 */
public class ErrorIOInstanceException extends Exception {

    /**
     * Creates a new instance of
     * <code>ErrorDeletingInstanceException</code> without detail message.
     */
    public ErrorIOInstanceException() {
    }

    /**
     * Constructs an instance of
     * <code>ErrorDeletingInstanceException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public ErrorIOInstanceException(String msg) {
        super(msg);
    }
}
