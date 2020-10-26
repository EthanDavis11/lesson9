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
public class Triangle extends Shape{
protected double x2,y2,x3,y3;
    
    public Triangle(){
        super();
        x2=y2=x3=y3;
    }
    
    public Triangle(double x,double y,double xn2,double yn2,double xn3,double yn3){
        super(x,y);
        x2=xn2;
        x3=xn3;
        y2=yn2;
        y3=yn3;
        
    }
//Math.sqrt((x1-x2)*(x1-x2) + (y1-y2) * (y1-y2));
    public double area() {
        return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3)) / 2;
    }


    public void draw(Pen p) {
       p.up();
       p.move(xPos,yPos);
       p.setDirection(0);
       p.down();
       p.move(Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2) * (yPos-y2)));
       p.turn(120);
       p.move(Math.sqrt((x2-x3)*(x2-x3) + (y2-y3) * (y2-y3)));
       p.move(xPos,yPos);
       
    }


    public void strechBy(double factor) {
        x2= (x2-xPos) * factor + xPos;
        x3= (x3-xPos) * factor + xPos;
        y2= (y2-xPos) * factor + xPos;
        y3= (y3-xPos) * factor + xPos;


    }


    public String toString() {
        double area = area();
         String str = "TRIANGLE";
        str += "X-Y Position: " + "(" + xPos + "," + yPos + ")\n";
        str += "Area = " + Math.round(area);
        return str;
    }
    
}
