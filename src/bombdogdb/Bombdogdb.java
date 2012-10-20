/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bombdogdb;
import bombdogdb.core.DBManager;
import bombdogdb.core.TableManager;
import bombdogdb.core.exceptions.ContenedorNotExistException;
import bombdogdb.core.exceptions.ErrorIOInstanceException;
import bombdogdb.core.exceptions.PermissionException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.nio.charset.*;
//import java.nio.file.*;
/**
 *
 * @author w00x
 */
public class Bombdogdb {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorIOInstanceException, ContenedorNotExistException {
        try {
            DBManager manager = new DBManager("nuevo_nombre");
            TableManager table = new TableManager(manager, "lele");
            
        } catch (PermissionException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
