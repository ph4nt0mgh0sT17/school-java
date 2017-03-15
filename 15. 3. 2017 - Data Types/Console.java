package javaapplication6;

/**
 *
 * @author Prestige Student
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        
        //** Třída Character která se chová jako proměnná (char) **//
        Character c = 'c';
        
        c = new Character('Q');
        
        //** Číslo znaku Q v ASCII tabulce **//
        int code_char = (int)c;
        
        System.out.println(code_char);
        
        
        /** 
         * Metoda compareTo k porovnávání dvou proměnných
         * První je menší než druhý => -1
         * První je stejný jak druhý => 0
         * První je větší než druhý => +1
         */
        
        int charCompare = c.compareTo('P');
        
        System.out.println(charCompare);
        
        opticLine();
        
        //** Třída String **/
        String line = "radar";
        
        System.out.println(line);
        
        opticLine();
                                            
        int stringCompare = line.compareTo("neco");
        
        System.out.println(stringCompare);
        
        opticLine();
        
        System.out.println(String.format("Délka věty \"%s\" je: %s",line,line.length()));
        
        opticLine();
        
        //** Vypsání Stringu pozpátku **/
        for (int i = line.length()-1; i >= 0; i--) {
            System.out.print(line.charAt(i));
        }
        
        System.out.println("");
        
        opticLine();
        
        System.out.println(String.format("Prázdný znakový řetězech isEmpty() je: %s","".isEmpty()));
        
        opticLine();
        
        //* String je imutable -> neměnný *//
        String s = "Na Do To Proč";
        
        s = s.toUpperCase();
        
        System.out.println(s);
        
    }
    //** Optický Oddělovač **//
    public static void opticLine() {
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
}
