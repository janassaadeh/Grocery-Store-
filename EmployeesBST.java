public class EmployeesBST {

    BSTNode root;

    public EmployeesBST() {
        this.root = null;
    }

    public EmployeesBST(BSTNode root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public BSTNode insert(BSTNode BSTNode,Employee employee) {
        if (BSTNode == null) {
            return new BSTNode(employee);
        } else {
            if (employee.id < BSTNode.e.id)
                BSTNode.left = insert(BSTNode.left, employee);
            else if (employee.id > BSTNode.e.id)
                BSTNode.right = insert(BSTNode.right, employee);
            return BSTNode;
        }
    }

    public void insert(Employee employee){
        insert(root,employee);
    }
    public Employee findMin(BSTNode root){
        String min = String.valueOf(root.e.id);
        while (root.left != null) {
            min = String.valueOf(root.left.e.id);
            root = root.left;
        }
        return root.e;
    }

    public Employee successor(BSTNode root){
        root = root.right;
        while (root.left != null)
            root = root.left;
        return root.e;
    }

    public Employee predecessor(BSTNode root){
        root = root.left;
        while (root.right != null)
            root = root.right;
        return root.e;
    }

    public BSTNode delete(BSTNode root, Employee employee){
        if (root == null)
            return null;
        if (employee.id < root.e.id)
            root.left = delete(root.left, employee);
        else if (employee.id > root.e.id)
            root.right = delete(root.right, employee);
        else {
            if (root.left == null && root.right == null)
                return null;
            else if (root.right != null) {
                root.e = successor(root);
                root.right = delete(root.right, root.e);
            } else {
                root.e = predecessor(root);
                root.left = delete(root.left, root.e);
            }
        }
        return root;
    }

    public void delete(Employee employee){
        delete(root,employee);
    }

    public BSTNode search(BSTNode root, int id)
    {
        if (root == null || root.e.id == id)
            return root;
        if (root.e.id < id)
            return search(root.right, id);
        return search(root.left, id);
    }

    public void search(Employee employee){
        search(root,employee.id);
        System.out.print(" The employee you're searching for is :");
        System.out.println(employee);
    }



    public void inorder(BSTNode root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.e.fName+ " , ");
            inorder(root.right);
        }

    }
    public void inorder(){
        inorder(root);
        System.out.println("");

    }


}