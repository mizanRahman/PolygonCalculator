/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;


/**
 *
 * @author mizan
 */
public class Ellipse extends Shape {

    private double radius1;
    private double radius2;

    public Ellipse(double r1, double r2) {
        this.radius1 = r1;
        this.radius2 = r2;
    }

    public double area() {
        return Math.PI * radius1 * radius2;
    }

    @Override
    public String toString() {
        return "Ellipse(" + radius1 + "," + radius2 + ')';
    }
}
