
package e;


public class CustomerQueue {
     Qnode front, rear;
     int queueSize;    
//default constructor - initially front & rear are null; size=0; queue is empty

    public CustomerQueue() {
        front = null;
        rear = null;
        queueSize = 0;
    }

    //check if the queue is empty

    public boolean isEmpty() {
        return (queueSize == 0);
    }

    //Remove item from the front of the queue.
    public Customer dequeue() {
        Customer data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        queueSize--;
        System.out.println( data + " went out");
        return data;
    }

    //Add data at the rear of the queue.
    public void enqueue(Customer data) {
        Qnode oldRear = rear;
        rear = new Qnode();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        queueSize++;
        System.out.println( data + " entered");
    }
    public void display(){
        if(isEmpty()) {System.out.println("The Customers Queue is Empty");return;}
        System.out.println("The Customers Queue: ");
        Qnode current = this.front;
        while(current.next!=null){
            System.out.print("-");
            System.out.println(current.data);
            current = current.next;
        }
        System.out.print("-");
        System.out.println(current.data);
    
    }
    public Customer Searchbyname(String n){
        Qnode current = front;
        while(current!=null){
            if(current.data.name.equals(n)){
                
                return current.data;
            }         
             current = current.next;
        }  
                return null; 
    }
}
