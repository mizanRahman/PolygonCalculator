/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;

import polygon.Shape;

/**
 *
 * @author mizan
 */
public class Rhombus extends Shape{

    private double diagonal1;
    private double diagonal2;

    public Rhombus(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public double area() {
        return  diagonal1 * diagonal2 * 0.5;
    }

    @Override
    public String toString() {
        return "Rhombus(" + diagonal1 + "," + diagonal2 + ')';
    }





}
