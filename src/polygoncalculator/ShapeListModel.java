/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygoncalculator;

import polygon.Shape;
import javax.swing.AbstractListModel;

/**
 * provides the model for JList
 * synchronizes with the sorted shapeList
 * @author mizan
 */
public class ShapeListModel extends AbstractListModel {

    private SortedArrayList<Shape> sortedShapeList ;

    ShapeListModel(SortedArrayList<Shape> shapeList) {
        sortedShapeList = shapeList;
    }

    public void addElement(Shape shape) {
        sortedShapeList.addSorted(shape);
        fireIntervalAdded(this, sortedShapeList.size()-1, sortedShapeList.size()-1);
    }

    @Override
    public Object getElementAt(int index) { return sortedShapeList.get(index); }

    @Override
    public int getSize() { return sortedShapeList.size(); }

    void removeElement(int selectedIndex) {
        sortedShapeList.remove(selectedIndex);
    }
}
