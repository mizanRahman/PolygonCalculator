/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polygoncalculator;

/**
 *
 * @author mizan
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + "," + height + ')';
    }
}
