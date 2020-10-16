/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceex2;

import TurtleGraphics.Pen;

/**
 *
 * @author etha6200
 */
public class Circle implements Shape{
    protected double xPos,yPos,radius;
    
    public Circle(){
        xPos=0;
        yPos=0;
        radius=0;
    }
    
    public Circle(double x,double y,double r){
        xPos=x;
        yPos=y;
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
            p.turn(3.333333);
            
        }
    }

    public double getXPos() {
       return xPos;
    }

   
    public double getYPos() {
        return yPos;
    }

   
    public void move(double xLoc, double yLoc) {
       xPos=xLoc;
       yPos=yLoc;
    }

    
    public void strechBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += "(" + xPos + "," + yPos + ")";
        str+= radius;
        return str;
    }
    
}
