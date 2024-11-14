class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void addNode(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node rt, int data) {
        if (rt == null) {
            return new Node(data);
        }

        if (data < rt.data) {
            rt.left = addRecursive(rt.left, data);
        } 
        else if (data > rt.data) {
            rt.right = addRecursive(rt.right, data);
        }   

        return rt;
    }

    public boolean searchNode(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node rt, int data) {
        if (rt == null) {
            return false;
        }
        if (data == rt.data) {
            return true;
        }
        if(data < rt.data){
            return searchRecursive(rt.left, data);
            }
        else{
            return searchRecursive(rt.right, data);
            }
    }

    public int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(70);
        tree.addNode(20);
        tree.addNode(40);
        tree.addNode(60);
        tree.addNode(80);
        tree.addNode(90);

        
        System.out.println("Is 40 in the tree? " + tree.searchNode(40));
        System.out.println("Is 100 in the tree? " + tree.searchNode(100));

        System.out.println("Total number of nodes: " + tree.countOfNodes(tree.root));

        System.out.println("Height of the tree: " + tree.height(tree.root));
    }
}
