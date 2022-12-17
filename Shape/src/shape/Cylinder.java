/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author fares
 */
public class Cylinder extends Circle {
    private double height;
    double volume ;

    public Cylinder() {
        height=1.0;
    }
    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double radius, String colour, double height) {
        super(radius, colour);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return  super.getArea()* height ;
    }
    
    
}
