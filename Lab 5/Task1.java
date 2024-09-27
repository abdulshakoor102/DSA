public class Task1 {
    Node head,tail;
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            tail = node;
            tail.prev = temp;
        }
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println();
    }

    void revDisplay(){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.addLast(1);
        t1.addLast(2);
        t1.addLast(3);
        t1.addLast(4);
        t1.addLast(5);
        System.out.println("Original Linked List");
        t1.display();
        System.out.println("Reversed Linked List");
        t1.revDisplay();
    }
}
