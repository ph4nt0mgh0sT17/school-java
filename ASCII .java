/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii;

import java.io.*;

/**
 *
 * @author student
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("ascii.txt"));
            
            
            
        }
        catch (Exception e) {
            
        }
        
        int number = 32;
            while (number <= 126) {
                fw.write((char)number + " ");
                number++;
            }
            fw.flush();
        System.out.println((char)56);
        
        
    }
    
}
