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
public class PTEmployee extends Employee{
    
    public PTEmployee(){
        super();
    }
   
    public double getPay(){
        double pay = rate * hours;
        total_pay+=pay;
        return pay;
}
}