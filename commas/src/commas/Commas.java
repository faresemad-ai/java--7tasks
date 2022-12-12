/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commas;

/**
 *
 * @author fares
 */
public class Commas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String str = "123,2000,100";
        str  = str .replaceAll(",","");
        System.out.println("Using replaceAll: " +str );
    }
        // TODO code application logic here
    
    
}
