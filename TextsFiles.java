/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textsfiles;

/**
 *
 * @author DavídečeQ
 */
import java.io.*;

public class TextsFiles {

    /**
     * @param args the command line arguments
     */
    /** Čtení čísel z textového souboru - nutno použít try catch jinak by jsme museli založit throws Exception což je složitější **/
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))){
            BufferedWriter bw = new BufferedWriter(new FileWriter("numbers_odd.txt"));
            int result = 0;
            int number = 0;
            String line = br.readLine();
            String[] array_line =  line.split(",");
            int[] resultArray = new int[array_line.length];
            
            for (int i = 0; i< array_line.length; i++)
            {
                number = Integer.parseInt(array_line[i]);
                result += number;
                
                if (number %2 ==1)
                {
                    bw.write(array_line[i]);
                    bw.newLine();
                    
                }
                
            }
            bw.flush();
            System.out.println(result);
        } catch (Exception ex) {
            
        }
      
    }
    
}
