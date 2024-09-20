class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
    }
}

class Task3{
    int size =0;
    Node addNote(String data, Node node){
        Node newNode = new Node(data);
        size ++;
        if(node == null){
            node = newNode;
        }
        else{
            Node temp = node;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return node;
    }
    
    void createCycle(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head.next;
    }

    void printList(Node head){
       if(head != null){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }}
    
    void checkCycle(Node head){
        Node temp = head;
        int check =0;
        while(temp != null){
            temp = temp.next;
            check++;
            if(check> size){
                System.out.println("Cycle Founded in the list");
                break;
            }
        }
        if(check <= size)
        { System.out.println("Cycle not founded");}
    }
    public static void main(String args[]){
        lab3Ex3 list = new lab3Ex3();
        Node head=null;
        head = list.addNote("aladin", head);
        head = list.addNote("Safeguard", head);
        head = list.addNote("Germander", head);

        System.out.println("before apply cycle method: ");
        list.printList(head);
        System.out.println();
        list.checkCycle(head);

        System.out.println("\nAfter apply cycle method:");
        list.createCycle(head);
        list.checkCycle(head);
    }
}
