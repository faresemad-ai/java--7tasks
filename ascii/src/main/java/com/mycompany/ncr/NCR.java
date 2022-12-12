/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ncr;
import java.util.Scanner;

/**
 *
 * @author fares
 */
public class NCR {

    public static void main(String[] args) {
        System.out.println("enter no ");
        Scanner input = new Scanner (System.in);
        int no = input.nextInt();
        char x = (char) no;
        System.out.println(x);
        
    }
}
