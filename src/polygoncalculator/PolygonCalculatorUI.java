/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PolygonCalculatorUI.java
 *
 * Created on May 19, 2013, 12:53:05 AM
 */
package polygoncalculator;

import polygon.Ellipse;
import polygon.Triangle;
import polygon.Square;
import polygon.Rhombus;
import polygon.Circle;
import polygon.Shape;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Comparator;

/**
 * user interface for Polygon Calculator
 * @author mizan
 */
public class PolygonCalculatorUI extends javax.swing.JFrame {

    private enum Polygon {

        Triangle, Ellipse, Square, Rhombus, Circle;
    }
    private Polygon polygonSelected = null;
    private ShapeListModel sListModel;

    /*
     * Listens for selection change in the combobox
     * loads proper input panel
     */
    private ItemListener itemListener = new ItemListener() {

        public void itemStateChanged(ItemEvent itemEvent) {
            ItemSelectable is = itemEvent.getItemSelectable();
            try {
                polygonSelected = Polygon.valueOf(selectedString(is));
            } catch (Exception e) {
                System.out.println("Something wrong while selecting the shape");
                return;
            }

            if (polygonSelected != null) {
                switch (polygonSelected) {
                    case Triangle:
                        showInput1("Base");
                        showInput2("Height");
                        break;
                    case Ellipse:
                        showInput1("Radius1");
                        showInput2("Radius2");
                        break;
                    case Square:
                        showInput1("Length");
                        hideInput2();
                        break;
                    case Rhombus:
                        showInput1("Diagonal");
                        showInput2("Diagona2");
                        break;
                    case Circle:
                        showInput1("Radius");
                        hideInput2();
                        break;
                    default:
                        break;
                }
            }
        }
    };

    /*
     * Creates new form PolygonCalculatorUI
     */
    public PolygonCalculatorUI() {
        initComponents();
        polygonSelected = Polygon.valueOf(shapeComboBox.getSelectedItem().toString());
        shapeComboBox.addItemListener(itemListener);
        sListModel = new ShapeListModel(new SortedArrayList<Shape>(new Comparator<Shape>() {

            public int compare(Shape s1, Shape s2) {
                return s1.compareTo(s2);
            }
        }));
        shapeListBox.setModel(sListModel);

        shapeListBox.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    try {
                        sListModel.removeElement(shapeListBox.getSelectedIndex());
                        shapeListBox.revalidate();
                        shapeListBox.repaint();

                    } catch (Exception ex) {}
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }
        });
    }

    /*
     * returns selected item in string format
     */
    private String selectedString(ItemSelectable is) {
        Object selected[] = is.getSelectedObjects();
        return ((selected.length == 0) ? "null" : (String) selected[0]);
    }

    /*
     * show the first input with provided label
     */
    private void showInput1(String label) {
        inputLabel1.setText(label);
        inputLabel1.setVisible(true);
        inputTextField1.setVisible(true);
    }

    /*
     * show the second input with provided label
     */
    private void showInput2(String label) {
        inputLabel2.setText(label);
        inputLabel2.setVisible(true);
        inputTextField2.setVisible(true);
    }

    /*
     *  Hides the second input with label
     */
    private void hideInput2() {
        inputLabel2.setVisible(false);
        inputTextField2.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shapeComboBox = new javax.swing.JComboBox();
        inputPanel = new javax.swing.JPanel();
        inputLabel1 = new javax.swing.JLabel();
        inputTextField1 = new javax.swing.JTextField();
        inputLabel2 = new javax.swing.JLabel();
        inputTextField2 = new javax.swing.JTextField();
        calculateButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shapeListBox = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        areaLabel = new javax.swing.JLabel();
        areaValLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Polygon Calculator");

        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Triangle", "Ellipse", "Square", "Circle", "Rhombus" }));

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        inputLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        inputLabel1.setText("Base");

        inputLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        inputLabel2.setText("Height");

        calculateButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        calculateButton1.setText("Calculate");
        calculateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(inputTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(calculateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel1)
                    .addComponent(inputTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(calculateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(shapeListBox);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Result"));

        areaLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        areaLabel.setText("Area: ");

        areaValLabel.setFont(new java.awt.Font("Tahoma", 0, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaLabel)
                .addGap(51, 51, 51)
                .addComponent(areaValLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaValLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaLabel))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButton1ActionPerformed

        Shape shape = null;

        if (polygonSelected != null) {
            try {
                switch (polygonSelected) {
                case Triangle:
                    shape = new Triangle(
                            Double.parseDouble(inputTextField1.getText()),
                            Double.parseDouble(inputTextField2.getText()));
                    break;
                case Ellipse:
                    shape = new Ellipse(
                            Double.parseDouble(inputTextField1.getText()),
                            Double.parseDouble(inputTextField2.getText()));
                    break;
                case Square:
                    shape = new Square(
                            Double.parseDouble(inputTextField1.getText()));
                    break;
                case Rhombus:
                    shape = new Rhombus(
                            Double.parseDouble(inputTextField1.getText()),
                            Double.parseDouble(inputTextField2.getText()));
                    break;
                case Circle:
                    shape = new Circle(
                            Double.parseDouble(inputTextField1.getText()));
                    break;
                default:
                    break;
            }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            
        }

        if (shape != null) {
            //add the shape to the listBox
            sListModel.addElement(shape);
            //show the calculated Polygon area 
            areaValLabel.setText(String.valueOf(shape.area()));

            inputTextField1.setText("");
            inputTextField2.setText("");
            System.out.println(shape);
        }





    }//GEN-LAST:event_calculateButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PolygonCalculatorUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel areaValLabel;
    private javax.swing.JButton calculateButton1;
    private javax.swing.JLabel inputLabel1;
    private javax.swing.JLabel inputLabel2;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JTextField inputTextField1;
    private javax.swing.JTextField inputTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox shapeComboBox;
    private javax.swing.JList shapeListBox;
    // End of variables declaration//GEN-END:variables
}
