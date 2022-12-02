package e;
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
