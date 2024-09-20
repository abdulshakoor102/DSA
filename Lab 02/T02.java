class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void findLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {  
            length++;
            temp = temp.next;
        }
        System.out.println("Total Length is: " + length);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class T02 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(8);
        list.addLast(10);
        System.out.print("LinkedList: ");
        list.display();
        list.findLength();
    }
}
