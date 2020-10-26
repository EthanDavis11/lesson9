/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;


import TurtleGraphics.Pen;

/**
 *
 * @author etha6200
 */
public class Rect extends Shape{
    private double width,height;
    
    public Rect(){
        super(0,0);
        width = 1;
        height = 1;
    }
    
    public Rect(double x,double y,double w, double h){
        super(x,y);
        width = w;
        height = h;
    }
    
    public double area() {
       return width * height;
    }


    public void draw(Pen p) {
       p.up();
       p.move(xPos,yPos);
       p.down();
       p.setDirection(0);
       p.move(width);
       p.turn(-90);
       p.move(height);
       p.turn(-90);
       p.move(width);
       p.turn(-90);
       p.move(height);
       
    }

    public void strechBy(double factor) {
        width *= factor;
        height *= factor;
    }
    
    public String toString(){
        String str = "RECTANGLE\n";
        double area = area();
        for (int i = 0; i < 10; i++) {
            Math.round(area);
        }
        str += "X-Y Position: " + "(" + xPos + "," + yPos + ")\n";
        str += "Width x Height: " + width + " x " + height + "\n";
        str += "Area = " + area;
        return str;
    }
    
    
    }
    

