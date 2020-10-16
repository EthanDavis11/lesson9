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
public class Circle extends Shape{
    protected double radius;
    
    public Circle(){
        super();
        radius=0;
    }
    
    public Circle(double x,double y,double r){
        super(x,y);
        radius=r;
    }

    public double area() {
       return Math.PI * radius * radius;
    }
    
    public void draw(Pen p) {
       double side = 2 * Math.PI * radius / 120;
       p.up();
       p.move(xPos,yPos);
       p.setDirection(0);
       p.move(radius);
       p.setDirection(90);
       p.down();
        for (int i = 0; i <= 120; i++) {
            p.move(side);
            p.turn(3);
            
        }
    }

    
    public void strechBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        double area = area();
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += "X-Y Position: " + "(" + xPos + "," + yPos + ")\n";
        str += "Area = " + Math.round(area);
        return str;
    }
    
}
