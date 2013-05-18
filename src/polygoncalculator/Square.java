/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygoncalculator;

/**
 *
 * @author mizan
 */
public class Square implements Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square(" + length + ')';
    }



    

}
