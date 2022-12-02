package e;

public class Node {
    Node next;
    ShoppingCartItem a;

    public Node() {
        this.next = null;
        this.a = null;
    }

    public Node(ShoppingCartItem a){
        this.a=a;
        this.next = null;
    }
}
