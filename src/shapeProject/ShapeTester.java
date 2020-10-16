/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author etha6200
 */
public class ShapeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        //Shape s = new Shape();
        Shape a = new Wheel(100, 100, 50, 6);
        a.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("enter");
        s.nextLine();
        p.setColor(Color.white);
        a.draw(p);
        a = makeOneShapeFromAnother(a,1);
        p.setColor(Color.blue);
        a.draw(p);
        Shape b = new Rect();
        Circle c = new Wheel();
        Circle cc = new Circle();

        //Wheel w = new Circle();
        Wheel w = new Wheel();

        System.out.println("Is c a shape?" + (c instanceof Shape));
        System.out.println("Is c a Circle?" + (c instanceof Circle));
        System.out.println("Is c a wheel?" + (c instanceof Wheel));
        System.out.println("Is c a Circle?" + (w instanceof Circle));
        System.out.println("Is cc a Wheel?" + (cc instanceof Wheel));

    }

    public static Shape makeOneShapeFromAnother(Shape inShape, int type) {
        Shape outShape;
        if (type == 1) {
          double area = inShape.area();
          return new Rect(inShape.getXPos(),inShape.getYPos(), Math.sqrt(area),Math.sqrt(area));

        } else if (type == 2) {
            double area = inShape.area();
            double rad = Math.sqrt(area / Math.PI);
            return new Circle(inShape.getXPos(),inShape.getYPos(),rad);
        }
        else{
          double area = inShape.area();
          double rad = Math.sqrt(area / Math.PI);
          return new Wheel(inShape.getXPos(),inShape.getYPos(),rad,5);
        }

    }
}