/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polygoncalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author mizan
 */
public class SortedArrayList<Shape> extends ArrayList<Shape> {

    Comparator<Shape> comparator;

    public SortedArrayList(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }
    public void addSorted(Shape mt) {
        int index = Collections.binarySearch(this, mt, comparator);
        if (index < 0) {
            index = ~index;
        }
        super.add(index, mt);
    }
}
