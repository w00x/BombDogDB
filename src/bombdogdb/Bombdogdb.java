/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bombdogdb;
import java.io.*;
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
    public static void main(String[] args) throws IOException {
        try {
            String path = "output_java_char.txt";
            
            //FileReader file = new FileReader(path);
            
            //BufferedReader br = new BufferedReader(file);
            
            File file_info = new File(path);
            RandomAccessFile br = new RandomAccessFile(file_info,"r");
            
            long tamanio = file_info.length();
            long tamanio_lines = 10;
            
            long num_linex_file = tamanio/tamanio_lines;
            
            long busco = 149999999;
                        
            String read_line;
            
            long clave = busco;
            long inferior = 0;                   // índice del elemento inferior
            long superior = num_linex_file;  // índice del elemento superior
            long medio;                    // índice del elemento medio
            long time_init = System.nanoTime();
            // iterar hasta que el índice inferior sea mayor que el superior
            while ( inferior <= superior ) {
                medio = ( inferior + superior ) / 2;  // determinar índice medio
                
                br.seek(medio*tamanio_lines);
                String actual_val_string = br.readLine();
                
                if(inferior == 0) {
                    actual_val_string = actual_val_string.substring(0, actual_val_string.length()-1);
                }
                
                long actual_val = Long.parseLong(actual_val_string);
                // si clave concuerda con elemento medio, devolver su ubicación
                if ( clave == actual_val ) {
                    System.out.println("Valor encontrado: "+actual_val);
                    break;
                }
                else if ( clave < actual_val ) {
                    superior = medio - 1;  
                }
                // clave mayor que elemento medio, establecer nuevo elemento inferior
                else
                    inferior = medio + 1;  

            } // fin de instrucción while
            br.close();
            
            long time_end = System.nanoTime();
            long tiempoTotal = time_end - time_init;
            System.out.println("El tiempo transcurrido es de: "+tiempoTotal);            
            System.out.println("Nanotime init: "+time_init);
            System.out.println("Nanotime end: "+time_end);
        }
        catch(Exception e) {

        }
        
        
//        try {
//              FileWriter file = new FileWriter("output_java_char.txt");
//  
//              int cantidad = 150000000;
//              int length = 10;
//              String insert;
//              
//              for(int i = 0;i<cantidad;i++) {
//                  insert = String.valueOf(i);
//                  int insert_length = insert.length();
//                  int sumo = length - insert_length;
//                  
//                  char complemento[] = new char[sumo];
//                  for(int j=0;j<sumo;j++) {
//                      complemento[j] = ' ';
//                  }
//                  complemento[sumo-1] = '\n';
//                  
//                  String line = insert+String.valueOf(complemento);
//                  file.write(line);
//              }
//  
//              file.close();
//          }
//          catch(Exception e) {
//  
//          }

    }
}
