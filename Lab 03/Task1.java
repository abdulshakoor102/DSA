class Node {
    String name;
    Node prev, next;
    Node (String name) {
    this.prev = null;
    this.next = null;
    this.name = name;
    }
   }

public class Task1{

        Node head;
      public void insertAtBeginning(String name) {
           Node newNode=new Node(name);
         if(head==null)
         {
             head=newNode;
         }
         else{
              newNode.next=head;
              head.prev=newNode;
              head=newNode;
         }
      }
     
        public void insertAtBeginning(Node node)
       {
         if(head==null)
         {
             head=node;
         }
         else{
              node.next=head;
              head.prev=node;
              head=node;
         }
       }
     // Add node in end of linkedlist, name as parameter 
       public void insertAtEnd(String name)
      {  Node newNode= new Node(name);
         if(head==null){
             head=newNode;
         }
         else{
             Node temp=head;
          while(temp.next!=null){
           temp=temp.next;
           
            }
            temp.next=newNode;
             newNode.prev=temp;
         }
     }
      // Add node in end of linkedlist, node as parameter 
      public void insertAtEnd(Node node)
      {
         if(head==null){
             head=node;
         }
         else{
             Node temp=head;
          while(temp.next!=null){
           temp=temp.next;
           }
            temp.next=node;
             node.prev=temp;}
      }
      
       public void insertAfterName(String name, Node node)
       {  Node temp=head;   
          while (temp!=null) {
             if (temp.name.equals(name)) {
                 node.next = temp.next;
                 node.next.prev = node;
                 temp.next = node;
                 node.prev = temp;
                 
             }
             temp = temp.next;
     
         
       }
     }
     
      // Add node before name which is provided as param , name 
     // and node as params 
      public void insertBeforeName(String name, Node node)
      {  Node temp=head;
         int count=1;
         while (temp!=null) {
             if (count==1) {
                   if (temp.name.equals(name)) {
                      node.next = temp;
                      temp.prev = node;
                      head = node;}
                   }
                   else{ node.next=temp;
                     temp.prev.next=node;
                     node.prev=temp.prev;
                     temp.prev=node;
     
                   }
                   count++;
                 }
     }
     
     public void printList(){
         if (head==null) {
             System.out.println("the list is empty.");
         }
         else{
             Node temp=head;
             while(temp!=null)
            { System.out.print(temp.name+" ");
             temp=temp.next;}
             System.out.println();
         }
             
             
         
     }
     
     
     //Make double linkedlist as Circular Double LinkedList 
      public void makeCircular()
      {
        
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.next = head;
        head.prev = temp.next;
      }
      // Print all the nodes in linkedlist, make sure it works on 
    
     
     
     

public static void main (String args[]){
    
    Task1 lt= new Task1();
    lt.insertAtBeginning("Suhail");
    lt.insertAtEnd("Happy");
    lt.insertAtBeginning("Ahmed");
    lt.printList();
   
}

    
}
