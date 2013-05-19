/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polygoncalculator;

import java.util.Comparator;

/**
 *
 * @author mizan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedArrayList<Shape> slist = new SortedArrayList<Shape>(new Comparator<Shape>() {
            public int compare(Shape s1, Shape s2) {
                return s1.compareTo(s2);
            }
        });

        slist.addSorted(new Triangle(10, 20));
        slist.addSorted(new Triangle(15, 20));
        slist.addSorted(new Triangle(5, 6));

        for (Shape s : slist) {
            System.out.println(s);


        }
    }
}
