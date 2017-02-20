/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test772;

import java.io.*;


/**
 *
 * @author student
 */
public class Program {

    
    public static void main(String[] args) {
        String binary = "";
        boolean binary_bool;
        binary_bool = true;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers"));
            String[] array = br.readLine().split(" ");
            int[] array_numbers = new int[array.length];
            
            for(int i = 0; i< array.length; i++) {
                array_numbers[i] = Integer.parseInt(array[i]);
            }
            
            for (int i = 0; i < array.length; i++) {
               String number_string = array[i];
                
                for (int j = 0; j < number_string.length(); j++) {
                    
                    if (Character.getNumericValue(number_string.charAt(j)) < 2) {
                     }
                    
                    else {
                        binary_bool = false;
                        break;
                    }
                    
                    
                }
                
                if (binary_bool == false) {
                    int number = array_numbers[i];
                    
                    while(number > 0)
                    {
                        binary+=number%2;
                        number/= 2;
                    }
                    binary = new StringBuilder(binary).reverse().toString();
                    System.out.println(array_numbers[i] + " = " + binary);
                }
                
                else {
                    String text = array[i];
                    int decimal = 0;
                    
                    for (int j = 0; j < text.length(); j++) {
                        double digit = Character.getNumericValue(text.charAt(j));
                                             
                        if (digit != 0)
                        {                            
                            decimal+= Math.pow(2, text.length()-j-1);
                        }
                        
                        
                        
                    }
                    System.out.println(array_numbers[i] + " = " + decimal);
                }
                
                
                binary = "";
            }
         
        }
        catch (Exception e) {
            
        }
    }
    
}
