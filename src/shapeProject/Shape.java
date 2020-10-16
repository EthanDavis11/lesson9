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

public abstract class Shape {
    protected double xPos, yPos;
    
    public Shape(){
        xPos=0;
        yPos=0;
    }
    
    public Shape(double xp, double yp){
        xPos = xp;
        yPos = yp;
    }
    
    abstract public double area();
    abstract public void draw(Pen p);
    
    final public double getXPos() {
       return xPos;
    }

   
    final public double getYPos() {
        return yPos;
    }

   
    public void move(double xLoc, double yLoc) {
       xPos=xLoc;
       yPos=yLoc;
    }
    
    abstract public void strechBy(double factor);
    abstract public String toString();
}
