
package java_kubala_27_02;

import java.util.Random;
import java.io.*;

/**
 *
 * @author student
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vítejte v mém programu... \n");
        System.out.println("Autor: David Miko \nDatum: 27. 2. 2017");
        generateDice("Random_Dice.txt", 12);
        generateOddNumbers("Odd_Numbers.txt", 54, 122);
        generateOddEvenNumbers("Even_Numbers.txt", 1, 252, true);
    }
    
    /* Generování náhodných čísel do souboru 
     * file_name - jméno souboru, který vytvořím
     * count - počet hodů kostkou (náhodně generované číslo od 1 - 6)
    */
    private static void generateDice(String file_name, int count) {
        try {
            FileWriter fw = new FileWriter(file_name, false);
            while (count > 0) {
                String message = "";
                int rnd = new Random().nextInt(6) + 1;
                switch (rnd) {
                    case 1: 
                        message += "xxxxxxxxxxx\n";
                        message += "x         x\n";
                        message += "x         x\n";
                        message += "x    x    x\n";
                        message += "x         x\n";
                        message += "x         x\n";
                        message += "xxxxxxxxxxx\n";
                    break;
                    
                    case 2:
                        message += "xxxxxxxxxxx\n";
                        message += "x         x\n";
                        message += "x  x      x\n";
                        message += "x         x\n";
                        message += "x      x  x\n";
                        message += "x         x\n";
                        message += "xxxxxxxxxxx\n";
                    break;
                        
                    case 3:
                        message += "xxxxxxxxxxx\n";
                        message += "x         x\n";
                        message += "x  x      x\n";
                        message += "x    x    x\n";
                        message += "x      x  x\n";
                        message += "x         x\n";
                        message += "xxxxxxxxxxx\n";
                    break;
                            
                    case 4:
                        message += "xxxxxxxxxxx\n";
                        message += "x         x\n";
                        message += "x  x   x  x\n";
                        message += "x         x\n";
                        message += "x  x   x  x\n";
                        message += "x         x\n";
                        message += "xxxxxxxxxxx\n";
                    break;
                        
                    case 5:
                        message += "xxxxxxxxxxx\n";
                        message += "x         x\n";
                        message += "x  x   x  x\n";
                        message += "x    x    x\n";
                        message += "x  x   x  x\n";
                        message += "x         x\n";
                        message += "xxxxxxxxxxx\n";
                    break;
                            
                    case 6:
                        message += "xxxxxxxxxxx\n";
                        message += "x         x\n";
                        message += "x  x   x  x\n";
                        message += "x  x   x  x\n";
                        message += "x  x   x  x\n";
                        message += "x         x\n";
                        message += "xxxxxxxxxxx\n";
                    break;
                            
                }
                fw.write(message);
                count--;
                
            }
            fw.flush();
        }
        
        
        catch (Exception e) {
            
        }
        
    }
    
    /* Generování lichých čísel do souboru 
     * file_name - jméno souboru, který vytvořím
     * from - Začátek začátku generování čísel
     * to - Konec generování čísel
     * Např. Pokud bych měl nastavený from - 54 a to - 122, tak to vygeneruje lichá čísla od 54 do 122
    */
    private static void generateOddNumbers(String file_name, int from, int to) {
        try {
            FileWriter fw = new FileWriter(file_name, false);
            for (int i = from; i <= to; i++) {
                if (i % 2 == 1) {
                    fw.write(i + " ");
                }
            }
            fw.flush();
        }
        catch (Exception e) {
        }
    }
    
    /* Generování lichých nebo sudých čísel do souboru 
     * file_name - jméno souboru, který vytvořím
     * from - Začátek začátku generování čísel
     * to - Konec generování čísel
     * even - Pokud true, sudá čísla, ale pokud false, tak lichá...
     * Např. Pokud bych měl nastavený from - 54 a to - 122, tak to vygeneruje lichá čísla od 54 do 122
    */
    private static void generateOddEvenNumbers(String file_name, int from, int to, boolean even) {
        try {
            
            FileWriter fw = new FileWriter(file_name, false);
            
            if (even) {
                fw.write("Sudá čísla: \n");
            }
            
            if (!even) {
                fw.write("Lichá čísla: \n");
            }
            
            
            for (int i = from; i <= to; i++) {
                if (i % 2 == 1 && !even) {
                    fw.write(i + " ");
                }
                
                else if (i % 2 == 0 && even) {
                    fw.write(i + " ");
                }
            }
            fw.flush();
        }
        catch (Exception e) {
        }
    }
            
    
}
