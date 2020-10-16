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
public class Rect implements Shape{
    private double xPos, yPos;
    private double width,height;
    
    public Rect(){
        xPos=0;
        yPos=0;
        width = 1;
        height = 1;
    }
    
    public Rect(double x,double y,double w, double h){
        xPos=x;
        yPos=y;
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
        width *= factor;
        height *= factor;
    }
    
    public String toString(){
        String str = "RECTANGLE\n";
        str += "(" + xPos + "," + yPos + ")";
        str += "Width x Height: " + width + " x " + height + "\n";
        return str;
    }
    
    
    }
    

