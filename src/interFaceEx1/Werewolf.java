/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interFaceEx1;

/**
 *
 * @author etha6200
 */
public class Werewolf implements Monster{

    private String name;
    
    public Werewolf(String n){
        name = n;
    }
    
    public void attack() {
        System.out.println("Werewolf attack");
    }


    public void identify() {
        System.out.println("I am " + name + " the Werewolf.");
    }
    
}
