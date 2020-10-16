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
public class DrawShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape x = new Rect(100,-50,200,75);
        Shape y = new Circle(100,50,50);
        Shape z = new Wheel(50,100,100,10);
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        x.draw(p);
        p.setColor(Color.green);
        y.draw(p);
        z.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to move rectangle to -200,-200");
        s.nextLine();
        p.setColor(Color.white);
        x.draw(p);
        x.move(-200, -200);
        p.setColor(Color.red);
        x.draw(p);
        
        System.out.println("Press enter to resize circle by 1/2");
        s.nextLine();
        p.setColor(Color.white);
        y.draw(p);
        y.strechBy(0.5);
        p.setColor(Color.red);
        y.draw(p);
        
     (  (Wheel)z).setSpokes(3);
    
}
}
