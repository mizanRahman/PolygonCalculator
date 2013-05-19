/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygoncalculator;

/**
 *
 * @author mizan
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ')';
    }
    




}
