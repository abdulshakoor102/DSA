class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MinandMax {
    Node root;

    public MinandMax() {
        root = null;
    }


    public int minNumber(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }


    public int maxNumber(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }


    public void addNode(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    public static void main(String[] args) {
        MinandMax tree = new MinandMax();
        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(70);
        tree.addNode(20);
        tree.addNode(40);
        tree.addNode(60);
        tree.addNode(80);

        System.out.println("Minimum value in the tree: " + tree.minNumber(tree.root));
        System.out.println("Maximum value in the tree: " + tree.maxNumber(tree.root));
    }
}
