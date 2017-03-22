/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author student
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ahojkyyyy");
        
        BufferedReader br;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Napište název složky: ");
        String file_name = s.next() + ".txt";
        
        
        LinkedList<String> list = new LinkedList<String>();
        
        
            
        
        
        
        
        /* Kdyby nastala nějaká chyba při čtení souboru... (Soubor by nebyl nalezen nebo další problémy) */
        try {
            br = new BufferedReader(new FileReader(file_name));
            String line = "";
            while(br.ready()){
                line = br.readLine();
                System.out.println(line);
                
                list.add(line.split(" ")[0]);
                list.add(line.split(" ")[1]);
                list.add(line.split(" ")[2]);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nebyl nalezen.");
        } catch (Exception e) {
            System.out.println("Stala se chyba. Kubala approves.");
        }
        
        for (String element : list) {
            System.out.println(element);
        }
        
        
        
           
             
    }
    
}
