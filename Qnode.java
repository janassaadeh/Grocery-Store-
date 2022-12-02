package e;
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
