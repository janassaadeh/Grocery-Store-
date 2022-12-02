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
public class ShoppingCartItem {
    Item item;
    int Quantity;

    public ShoppingCartItem(Item item, int Quantity) {
        this.item = item;
        this.Quantity = Quantity;
    }
    public ShoppingCartItem() {
        this.item = null;
        this.Quantity = 0;
    }
    @Override
    public String toString() {
        return   item+", Quantity: " + Quantity ;
    }
    
}
