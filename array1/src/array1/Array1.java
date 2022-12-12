/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1;

/**
 *
 * @author fares
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double[] Array = { 2.34, 31.5, 5.0, 33.5, 55.5, -437, 57, 6.65 };
        double largest = Array[0];
        for (int i=0; i < Array.length; i++) {
            if(largest < Array[i])
                largest = Array[i];
}
System.out.println("Largest element is " + largest); }
        // TODO code application logic here
    }
    

