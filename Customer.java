/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

/**
 *
 * @author janas
 */
public class Customer {
    String name;
    

    public Customer(String name) {
        this.name = name;
       
    }
    public Customer() {
        this.name = null;
        
    }  

    @Override
    public String toString() {
        return "Customer " + "name: " + name ;
    }
    
}
