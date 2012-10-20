/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bombdogdb.core.exceptions;

/**
 *
 * @author w00x
 */
public class ContenedorNotExistException extends Exception {

    /**
     * Creates a new instance of
     * <code>ContenedorDBNotExistException</code> without detail message.
     */
    public ContenedorNotExistException() {
    }

    /**
     * Constructs an instance of
     * <code>ContenedorDBNotExistException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public ContenedorNotExistException(String msg) {
        super(msg);
    }
}
