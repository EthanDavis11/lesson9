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
public class Wheel extends Circle{
    
    private int spokes;
    
    public Wheel(){
    super();
    spokes = 3;
    }
    
     public Wheel(double x, double y, double r, int s){
         super(x,y,r);
         spokes = s;
     }
     
     public void draw(Pen p){
         super.draw(p);
         for (int i = 1; i <= spokes; i++) {
             p.up();
             p.move(xPos,yPos);
             p.down();
             p.setDirection(i * 360 / spokes);
             p.move(radius);
         }
     }
     public void setSpokes(int s){
         spokes = s;
     }
     
     public String toString(){
         double area = area();
            Math.round(area);
            String str = "Wheel\n";
            str += "Radius: " + radius + "\n";
            str += "(" + xPos + "," + yPos + ")";
            str+= radius;
            return str;
     }
}

