/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeAssignment;

/**
 *
 * @author etha6200
 */
public class FTEmployee extends Employee{
    
    public FTEmployee(){
        super();
    }
   
    public double getPay(){
        double pay = rate * 40 + (hours-40)*(rate*2);
        total_pay+=pay;
        return pay;

            
}
}