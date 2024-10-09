import java.util.Scanner;

class Task6_print_linkedlist{
     int count=0; long startTime1,startTime;
    class Node{
                int data;
                Node next;
                Node (int data)
                {
                    this.data=data;
                    this.next=null;
        
                }
            }

    void printRecursive(Node n){
        startTime1 = System.nanoTime();	//record the starting time 
        if (n!=null) {
            System.out.print(n.data+ " ");
            printRecursive(n = n.next);
        }

    }
           
    //   add first
    Node head;
    public void addFirst(int data)
    { count++;
        Node newNode =new Node(data);
         if (head==null) {
            head=newNode;
    
        }
          else { 
            Node temp;
            temp=head;
            head=newNode;
            newNode.next=temp;
        }
    }
         
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Task6_print_linkedlist ll = new Task6_print_linkedlist();
        System.out.println("Using Altrative: ");
        
        for (int i = 0; i <10 ; i++) {
             ll.startTime = System.nanoTime();	//record the starting time 
            ll.addFirst(i+2+i);
        }
        Node temp1= ll.head;
       while (temp1!=null) {
        System.out.print(temp1.data+" ");
        temp1=temp1.next;
        

      }
      long endTime   = System.nanoTime();	//record the ending time 
      long totalTime = endTime -ll.startTime;//compute the elapsed time

      System.out.println();
      System.out.println("Using Recursive: ");
      Node tp = ll.head;

      ll.printRecursive(tp);
      long endTime1  = System.nanoTime();	//record the ending time 
      long totalTime1 = endTime1 - ll.startTime1;//compute the elapsed time
      System.out.println();
      System.out.println("Finding Time Complexity:");
      System.out.println("Iterative Time = " + totalTime);
      System.out.println("Recursive Time = " + totalTime1);
     if (totalTime<totalTime1) {
        System.out.println("Iterative time complexity is less from Recursive");
        
     }else{
        System.out.println("Recursive time complexity is less from Iterative");
     }



    }


}