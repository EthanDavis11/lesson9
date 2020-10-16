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
public interface Shape {
    public double area();
    public void draw(Pen p);
    public double getXPos();
    public double getYPos();
    public void move(double xLoc,double yloc);
    public void strechBy(double factor);
    public String toString();
}
