/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ncr.npr;
import java.util.Scanner;

/**
 *
 * @author fares
 */
public class NcrNpr {
    public static long factorial(int n) {
        int c;
        long result = 1;
        for (c = 1; c <= n; c++) {
            result = result * c;
        }
        return result; }
    public static long findNcr(int n, int r) {
        long result;
        result = factorial(n) / (factorial(r) * factorial(n - r));
        return result;
    }

    public static long findNpr(int n, int r) {
        long result;
        result = factorial(n) / factorial(n - r);
        return result;
    }

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int n, r;
        long ncr, npr;
        System.out.println("Enter the value of n ");
        n = input.nextInt();
        System.out.println("Enter the value of  r");
        r = input.nextInt();

        ncr = findNcr(n, r);
        npr = findNpr(n, r);
        System.out.println("ncr=" + ncr);
        System.out.println("npr=" + npr);

    }

        // TODO code application logic here
}
    

