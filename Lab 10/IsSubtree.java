class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class IsSubtree {
    Node root;

    public boolean isIdentical(Node x, Node y) {
        if (x == null && y == null) {
            return true;
        }
        if (x == null || y == null) {
            return false;
        }
        return (x.data == y.data) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
    }

    public boolean isSubTree(Node x, Node y) {
        if (y == null) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (isIdentical(x, y)) {
            return true;
        }
        return isSubTree(x.left, y) || isSubTree(x.right, y);
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);

        tree2.root = new Node(2);
        tree2.root.left = new Node(4);
        tree2.root.right = new Node(5);

        System.out.println("Is tree2 a subtree of tree1? " + tree1.isSubTree(tree1.root, tree2.root));

        tree2.root.right.data = 6;
        System.out.println("Is tree2 a subtree of tree1? " + tree1.isSubTree(tree1.root, tree2.root));
    }
}

