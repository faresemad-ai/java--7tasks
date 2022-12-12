/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author fares
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        tr.setside1(3);
        tr.setside2(5);
        tr.setside3(6);
        
        System.out.println("Triangle area="+ tr.area() );
        System.out.println("Triangle circumference ="+ tr.circumference());
        
        circle cr=new circle();
        cr.setredius(10);
        System.out.println("Circle area="+ cr.area() );
        System.out.println("Circle circumference ="+ cr.circumference());
    }
        // TODO code application logic here
    }
    

