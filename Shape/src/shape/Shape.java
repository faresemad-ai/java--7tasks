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
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(2.0);
        c1.setHeight(3.0);
        System.out.println("radius=" + c1.getRadius()
        + "height=" + c1.getHeight()
        + "area=" + c1.getArea()
        + "volume=" + c1.getVolume());
    }
    
}
