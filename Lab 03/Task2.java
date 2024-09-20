class linkedList{
    Node head, tail;int size;

    linkedList(){
        size = 0;
    }
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    boolean isEmpty(){// checked working Good
        if(head == null){
            return true;
        }
        return false;
    }

    void add(int item){// checked working Good
        size++;
        Node newNode = new Node(item);
        if(head == null){
           head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;

    }
    
    void add(int index, Node item){// checked working Good
        if(index<=size+1){
            if(index == 1){
                item.next = head;
                head = item;
                size++;
            }
            else{
                Node temp = head;
                for(int i=1; i<index-1; i++){
                temp = temp.next;
            }
            item.next = temp.next;
            temp.next = item;
            if(index > size){
                tail = item;
            }
            size++;
        }
    }
}
    
    void remove(int index){// checked working Good
       if(index == 1 && head != null){
        head = head.next;
        size--;
       }else{
        Node temp = head;
        try{for(int i=1; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(index == size){
            tail = temp;
        }
        size--;}catch(Exception e){
            System.out.println("Error: Make sure your entered index should be equal to size of list:");
        }
    }}
    
    void remove(Node item){// checked working Good
        Node temp = head;
        Node preTemp = null;
        while(temp != null){
            if(item.data == temp.data){

                preTemp.next = temp.next;
                if(preTemp.next == null){
                    tail = preTemp;
                }
                size--;
                break;
            }else{
                preTemp = temp;
                temp = temp.next;}}}

    linkedList duplicate(){// checked working Good
        linkedList dupList = new linkedList();
        if(head != null){
            Node temp = head;
            while(temp != null){
                dupList.add(temp.data);
                temp = temp.next;
            }
        }
        else{
            System.out.println("List_Empty");
        }
        return dupList;
    }
    
    linkedList duplicateReversed(){// checked working Good
        linkedList dupReverse = new linkedList();
        if(head != null){
            Node temp = head;
            while(temp != null){
                Node newNode = new Node(temp.data);
                if(dupReverse.head == null){
                    dupReverse.tail = newNode;
                }
                newNode.next = dupReverse.head;
                dupReverse.head = newNode;
                dupReverse.size++;
                temp = temp.next;
            }
            return dupReverse;
        }
        else{
            System.out.println("List_Empty");
            return null; 
        }
    }      
    
    public String toString(){
        System.out.println("Size : " + size );
        System.out.print(" - ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " , ");
            temp = temp.next;}
        return "";}

    int size(){
        int size =0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;}}

class DoubleLinkedList{
    Node head,tail;
    int size=0;

    class Node{
        int data;
        Node prev,next;

        Node(int data){
        this.data = data;
    }
    }

    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    int size(){
        Node temp = head;
        int l=0;
        while(temp != null){
            l++;
            temp = temp.next;
        }
        return l;
    }

    void add(int item){
        Node newNode = new Node(item);
        size++;
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    @Override
    public String toString(){
        System.out.println("Size : " + size);
        System.out.print(" - ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        return "";
    }
    
    void add(int index, Node item){
        if(index<=size+1){
            if(index == 1){
                if(head == null){
                    head = item;
                    tail = item;
                }
                    else{
                    item.next = head;
                    head.prev = item;
                    head = item;
                }
                size++;
            }
            else if(index > 1 && index <= size){
                Node temp = head;
                for(int i=1; i<index-1; i++){
                temp = temp.next;
            }
            item.next = temp.next;
            temp.next.prev = item;
            item.prev =temp;
            temp.next = item;
            if(index > size){
                tail = item;
            }
            size++;
        }
        else{
            item.prev = tail;
            tail.next = item;
            tail = item;
        }
    }
    }

    void remove(int index){
        if(index>0 && index<=size){
            size--;
            if(index == 1){
            head = head.next;
            head.prev = null;
        }
        else if(index > 1 && index < size){
            Node temp = head;
            for(int i=1; i<=index-1; i++){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        else{
            tail = tail.prev;
            tail.next = null;

        }}
        else{
            System.out.println("index should be under the size of List:");
        }
    }

    void remove(Node item){
        Node temp = head;
        while(temp != null){
            if(temp.data == item.data){
                if(temp.next != null){
                    temp .prev.next = temp.next;
                temp.next.prev = temp.prev;
                }
                else{
                    tail = tail.prev;
                    tail.next = null;
                }
                size--;
                return;
            }
            else{
                temp = temp.next;
            }
        }
        System.out.println("Item Not founded");
    }
}

class Task2{
    public static void main(String args[]){

        DoubleLinkedList dList = new DoubleLinkedList();
        DoubleLinkedList.Node item1 = dList.new Node(9);

        dList.add(3);
        dList.add(2);
        dList.add(4);
        dList.add(6);
        dList.add(4, item1);
        dList.remove(3);

      System.out.println("Tail of DList: " + dList.tail.data);
        System.out.println(dList);

       
    }    
}
