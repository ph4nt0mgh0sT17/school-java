/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_3;

import java.io.*;


public class Console {

    /**
     * @param args the command line arguments
     * Pro správné fungování programu si musíme vytvořit ve složce s programem textový dokumentář: file.txt
     */ 
    public static void main(String[] args) {
        File f = new File("file.txt");
        
        FileReader fr;
                
        /* Čtení ze souboru...
         * try - catch je nutný...
         */
        try {
            fr = new FileReader(f);
           
                                    
            /* Převedení znaku na číselnou hodnotu.
             * Zda-li bude číslo -1, znamená to že už je celý dokument přečtený...
             */
            int code_char = fr.read();
            
            while ( code_char != -1) {
                System.out.println((char)code_char);
                code_char = fr.read();
            }
        } 
        /* V případě, že nebude nalezená požadovaná složka, vyhodí se tahle chyba... */
        catch (FileNotFoundException ex) {
            System.out.println("Složka nebyla nalezena. Zkuste znovu.");
        } 
        /* V případě jakkékoliv jiné chyby se stane tohle... */
        catch (Exception ex) {
            System.out.println("Stala se chyba.");
        }
        
       
        
    }
}
