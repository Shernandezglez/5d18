/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counternlp;
import cnt.count; 
import java.util.Scanner;

/**
 *
 * @author ASKII
 */
public class UsaCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        count c = new count();
        Scanner lector = new Scanner(System.in);
        String cdn ="";
        
        System.out.println("Escribe algo...");
        cdn = lector.nextLine();
        
        System.out.println(c.getWords(cdn) 
                + "\n" + c.getUni(cdn) 
                + "\n" + c.getSil(cdn));
        
        c.getChars(cdn);
    }
    
}
