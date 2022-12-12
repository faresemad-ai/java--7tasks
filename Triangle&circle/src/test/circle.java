/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author fares
 */
public class circle {
    private double radius;
    
    public void setredius(double r){
        radius =r;
    }   
    public double area(){
         return radius*radius*3.1415;
     }
      public double circumference(){
         return 2*radius*3.1415;
     }
}
