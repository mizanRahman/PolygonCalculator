/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygoncalculator;

/**
 *
 * @author mizan
 */
public class Parallelogram implements Shape{

    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return  base * height;
    }

    @Override
    public String toString() {
        return "Parallelogram(" + base + "," + height + ')';
    }





}
