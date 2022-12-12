/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author fares
 */
public class Triangle {
    private double side1, side2, side3,area;
    
    public void setside1(double a){
        side1 = a;
    }
    public void setside2(double b){
        side2 =b;
    }
    public void setside3(double c){
        side3 =c;
    }
    public double circumference(){
        return side1 + side2 + side3 ;
    }
    public double area (){
        double s = side1 +side2 + side3;
        return Math.sqrt (s*(s-side1)*(s-side2)*(s-side3));
    }
    
}
