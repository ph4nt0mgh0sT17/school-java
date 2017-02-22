/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileapplication;

/**
 *
 * @author Retrok
 * @version 1.00.000
 */

import java.io.*;
public class Console {

    /**  **/
    public static void main(String[] args) throws IOException {
        
        System.out.println("Začátek programu...");
        
        boolean write_success = false;
        
        File file = new File("file.txt");
        
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write("První řádek souboru...");
            
            int number = 0;
            
            fw.write("\n");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 5; j++) {
                    fw.write(String.valueOf(j+number));
                    fw.write("  ");
                }
                fw.write("\n");
                number = 10;
                
            }
            fw.flush();
            write_success = true;
        }
        catch (IOException ex) {
            System.out.println("Chyba");
        }
        
        
            
        
        if(write_success) {
            System.out.println("Zapsání souboru provedeno úspěšně!");
        }
        
        
    }
}
