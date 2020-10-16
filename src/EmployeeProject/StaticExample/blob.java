/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeProject.StaticExample;

/**
 *
 * @author etha6200
 */
public class blob {
    private String name;
    private static int blobCount=0;
    
    public blob(String n){
        name = n;
        blobCount+=1;
    }
    
    public String getName(){
        return name;
    }
    public static int getNumber(){
        return blobCount;
}
}