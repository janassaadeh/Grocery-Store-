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
public class Qnode {
    Customer data;
    Qnode next;

    public Qnode(Customer data) {
        this.data = data;
        this.next = null;
    }

    public Qnode() {
                this.data = null;
        this.next = null;
    }
    
}
