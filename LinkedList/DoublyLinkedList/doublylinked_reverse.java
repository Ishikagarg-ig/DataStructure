class DoublyLinkedList{
  Node head;
     class Node{
           Node next;
           Node prev;
           int data;
           Node(int d){
                data=d;
       }
   }
    
  void insert_end(DoublyLinkedList l,int d){
         Node n=new Node(d); 
           if(l.head==null){
            l.head=n;
            n.next=null;
         }
          else{
        Node last=l.head;
          while(last.next!=null){
                  last=last.next; 
            }
            last.next=n;
            n.next=null;
         }          
    }
  
  void reverse(DoublyLinkedList l){
       Node last=l.head;
          while(last.next!=null){
                  last.next.prev=last;
                  last=last.next; 
            }
            l.head=last;
            Node first=l.head;
            while(last.prev!=null){
                   last=last.prev;
                   first.next=last;
                   first=first.next;
              }
         first.next=null;
 }
  
   void print(DoublyLinkedList l){
        Node last=l.head;
         while(last!=null){
          System.out.println(last.data);
           last=last.next;   
     }
  }
   
  public static void main(String args[]){
     DoublyLinkedList l=new DoublyLinkedList();
     l.insert_end(l,10);
     l.insert_end(l,20);
     l.insert_end(l,30);
     l.insert_end(l,40);
     l.reverse(l);
     l.print(l);
  }
}