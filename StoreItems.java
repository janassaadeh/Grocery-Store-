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
import java.util.ArrayList;

public class StoreItems {
    ArrayList <Item> I= new ArrayList<Item>();
    public void addStoreItems(Item i){
        I.add(i);
    }
    public void removeStoreItems(Item i){
        I.remove(i);
    }
    public void printStoreItems(){
        if(I.isEmpty()){
            System.out.println("no store items yet !");
        }
        System.out.println("the store items :");
        for(int i=0;i<I.size();i++){
                System.out.println(I.get(i).toString());
    }}

    public void SearchByType(String t){
        System.out.println("items with type: "+t+" :");
        for(int i=0;i<I.size();i++){
            if((I.get(i).type).equals(t)){
                System.out.println(I.get(i).toString());
            }
        }
    }
    public void SearchById(String iid){
        System.out.println("items with "+iid+" :");
        for(int i=0;i<I.size();i++){
            if((I.get(i).id).equals(iid)){
                System.out.println(I.get(i).toString());
            }
        }
    }
    public Item findItemsWithId(String iid){
      
        for(int i=0;i<I.size();i++){
            if((I.get(i).id).equals(iid)){
                return I.get(i);
            }
        }        
        return null;
    }
    
}
