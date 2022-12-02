package e;

public class ShoppingCart {
    Node first;
    Customer c;
    int nbi;
    public ShoppingCart(Node first) {
        this.first = first;
    }

    public ShoppingCart(Customer c) {
        this.c=c;
        first = null;
        nbi=0;
    }
    public void insert(ShoppingCartItem a){
        Node n = new Node(a);
        Node current = this.first;
        if(first==null){
            this.first = n;
            nbi++;
        }
        else{
           while(current.next!=null){
               current = current.next;
           }
           current.next = n;
        }
        nbi++;
    }
  
    public void display(){
        if(this.first==null) {System.out.println("The Shopping Cart of"+c.name+" is Empty");return;}
        System.out.println("The Shopping Cart items of "+c.name+" : ");
        Node current = this.first;
        while(current.next!=null){
            System.out.print("-");
            System.out.println(current.a);
            current = current.next;
        }
        System.out.print("-");
        System.out.println(current.a);
    } 
    public void delete(Item i){
        if(first==null){
            System.out.println("the shopping cart is empty ");
        }
        if(first.a.item.equals(i)){
            this.first = this.first.next;
            nbi--;
           return; 
        }
        
        Node current=first;
        while(current.next!=null){
        if(current.next.a.item==i){
            current.next=current.next.next;
                 break;
        }
        current=current.next;
      }
        nbi--;
    }
    

     public ShoppingCartItem SearchandReturn(Item i){
         Node current = first;
        while(current!=null){
            if(current.a.item.equals(i)){
                
                return current.a;
            }         
             current = current.next;
        }  
                return null; 
    }
    public void Search(Item i){
         Node current = first;
        while(current!=null){
            if(current.a.item.equals(i)){
                System.out.println("Found: "+SearchandReturn(i));
                return;
            }         
             current = current.next;
        }  
                System.out.println("Not Found"); 
    }
    public void printTotal(){
       Node current = first;
       int total=0;
        for(int i=1;i<nbi;i++){
          int k=(current.a.Quantity)*(current.a.item.price);
          total=total+k;
          current=current.next;
                  }
        System.out.println("Total: "+total+" LBP");
    }

}