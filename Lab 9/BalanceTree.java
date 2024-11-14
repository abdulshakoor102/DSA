class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BalanceTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    
    public boolean balanceTree(Node root) {
        return isBalanced(root) != -1;
    }


    private int isBalanced(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = isBalanced(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = isBalanced(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BalanceTree tree = new BalanceTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Is the tree balanced? " + tree.balanceTree(tree.root));

    }
}
