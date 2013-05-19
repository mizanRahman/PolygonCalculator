/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygoncalculator;

import polygon.Shape;
import javax.swing.AbstractListModel;

/**
 *
 * @author mizan
 */
public class ShapeListModel extends AbstractListModel {

    private SortedArrayList<Shape> myArrayList ;

    ShapeListModel(SortedArrayList<Shape> shapeList) {
        myArrayList = shapeList;
    }

    public void addElement(Shape shape) {
        myArrayList.addSorted(shape);
        fireIntervalAdded(this, myArrayList.size()-1, myArrayList.size()-1);
    }

    @Override
    public Object getElementAt(int index) { return myArrayList.get(index); }

    @Override
    public int getSize() { return myArrayList.size(); }
}
