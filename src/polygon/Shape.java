/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;


/**
 *
 * @author mizan
 */
public abstract class Shape implements Comparable<Shape> {
    public abstract double area();

    public int compareTo(Shape s){
        return (int) (this.area() - s.area());
    }

}
