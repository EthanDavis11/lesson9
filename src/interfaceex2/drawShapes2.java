/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceex2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;

/**
 *
 * @author etha6200
 */
public class drawShapes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(1000,800));
        Shape shape[] = new Shape[20];
        for (int i = 0; i < shape.length; i++) {
            shape[i] = getRandomShape();
        }
        for (int i = 0; i < 10; i++) {
            p.setColor(getRandomColor());
            shape[i].draw(p);
            System.out.println(shape[i]);
            System.out.println("-------------------------------");
        }
        
    }
    public static Shape getRandomShape(){
        Shape s;
        int rx,ry,rr,rw,rh,randshap,rs;
        rx = (int)(Math.random() * 600 + -300);
        ry = (int)(Math.random() * 600 + -300);
        rr = (int)(Math.random() * 100 + 10);
        rw = (int)(Math.random() * 250 + 10);
        rh = (int)(Math.random() * 250 + 10);
        rs = (int)(Math.random() * 12 + 3);
        randshap = (int)(Math.random() * 3 + 1);
        
        if(randshap==1)
            s = new Rect(rx,ry,rw,rh);
        else if (randshap==2)
            s = new Circle(rx,ry,rr);
        else
            s= new Wheel(rx,ry,rr,rs);
        return s;
    }
    
    public static Color getRandomColor(){
        int rr,rg,rb;
        rr =(int)(Math.random() * 256);
        rg =(int)(Math.random() * 256);
        rb =(int)(Math.random() * 256);
        return new Color(rr,rg,rb);
    }
}
