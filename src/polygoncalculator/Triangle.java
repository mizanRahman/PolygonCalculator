/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygoncalculator;

/**
 *
 * @author mizan
 */
public class Triangle extends  Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle(" + base + "," + height + ')';
    }



}
