public class BSTNode {

    Employee e;
    BSTNode left, right;

    public BSTNode(Employee e) {
        this.e = e;
    }

    public BSTNode(){

    }

    public BSTNode(Employee e, BSTNode left, BSTNode right) {
        this.e = e;
        this.left = left;
        this.right = right;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
