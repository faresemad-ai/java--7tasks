/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;

/**
 *
 * @author fares
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} }; int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
        // Mutliplying Two matrices
        int[][] neww = new int[firstMatrix.length][secondMatrix[0].length];
        for(int i = 0; i < firstMatrix.length ; i++) {
            for (int j = 0; j < secondMatrix[0].length ; j++) {
                for (int k = 0; k < firstMatrix[0].length ; k++) {
neww [i][j] += firstMatrix[i][k] * secondMatrix[k][j]; }
} }
// Displaying the result System.out.println("Multiplication of two matrices is: "); for(int[] row : product) {
            for (int s=0 ; s< neww.length; s++ ) {
                for(int h=0; h<neww[0].length; h++)
                System.out.print(neww[s][h] + "    ");
                System.out.println();
}
            
        }
  } 
        // TODO code application logic here
    
    

