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
public class Circle {
    private double radius ;
    private String colour ;

    public Circle() {
        radius=1.0;
        colour= "red";
    }
    public Circle(double radius, String colour) {
        this.radius=radius;
    this.colour= colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(){
        return 3.14 * Math.pow(radius, 2);
    }
    
    
    
}
