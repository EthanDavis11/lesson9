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
public class BlobMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        blob a,b,c;
        a= new blob("Joey");
        b= new blob("Frankie");
        c= new blob("Moe");
        
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        
        System.out.println("---------------------");
        System.out.format("I have %d blobs\n",blob.getNumber());
        
    }
    
}
