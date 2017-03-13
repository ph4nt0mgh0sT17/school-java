
package javaexam;



/**
 *
 * @author ph4nt0m_gh0sT
 */
public class Console {

    /** 
     * @param args Argument Strings - argumenty příkazového řádku
     */
    public static void main(String[] args) {
        System.out.println("Vítejte v mém programu... \n");
        System.out.println("Autor: David Miko \nDatum: 13. 3. 2017");
        
        /**
         * Argumenty příkazového řádku
         * Lze nastavit v properties projectu -> pravým tlačítkem na váš projekt v Project Windows
         * Dále kliknout Properties a vybrat kolonku Run
         */
        
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        
        
        /**
         * Optický oddělovač, Kubalův oblíbený
         */
        System.out.println("\n");
        
        System.out.println("---------------------------------------------");
        
        System.out.println("");
        
        /**
         * Datový objekt - Object
         */
        
        /** Vytvoření 4 obecných objektů **/
        Object simpleObject1 = "xyz";
        Object simpleObject2 = 123;
        Object simpleObject3 = -159.52;
        Object simpleObject4 = true;
        
        /** Vypsání jich ve stringové podobě do konzole... **/
        System.out.println(simpleObject1.toString());
        System.out.println(simpleObject2.toString());
        System.out.println(simpleObject3.toString());
        System.out.println(simpleObject4.toString());
        
        System.out.println("\n");
        
        System.out.println("---------------------------------------------");
        
        System.out.println("");
        
        /** A tímhle zjistíme jaký je to typ classy (Integer, String, Boolean, a tak dáááááleee) **/
        System.out.println(simpleObject1.getClass());
        System.out.println(simpleObject2.getClass());
        System.out.println(simpleObject3.getClass());
        System.out.println(simpleObject4.getClass());
        
        System.out.println("\n");
        
        System.out.println("---------------------------------------------");
        
        System.out.println("");
        
        /** A tímhle zjistíme hashovací kód objektu... **/
        System.out.println(simpleObject1.hashCode());
        System.out.println(simpleObject2.hashCode());
        System.out.println(simpleObject3.hashCode());
        System.out.println(simpleObject4.hashCode());
        
        System.out.println("\n");
        
        System.out.println("---------------------------------------------");
        
        System.out.println("");
        
        /** A tímhle zjistíme zda-li se dané objekty shodují **/
        System.out.println(simpleObject1.equals(simpleObject2));
        System.out.println(simpleObject3.equals(simpleObject4));
        
        
        
    }
    
}
