/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpose;
import java.util.Scanner;

/**
 *
 * @author fares
 */
public class Transpose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][] a = new int [3][3];
       Scanner n = new Scanner(System.in);
       System.out.print("enter array numbers  ");
       for(int i=0; i< a.length ; i++){
            for(int j=0; j< a[0].length ; j++){
                a[i][j]=n.nextInt();
            }}
       
       
        System.out.println("transpose matrix : \n");
        for(int i=0; i< a[0].length ; i++){
            for(int j=0; j< a.length ; j++){
                System.out.print(a[j][i]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
       
        
        // TODO code application logic here
    }
    
}
