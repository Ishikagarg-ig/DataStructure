class LinkedList{
    Node head;
   static class Node{
       int data;
       Node next;
       Node(int d){
           data=d;
        }
    }

    void insert_end(LinkedList l, int d){
       Node n=new Node(d);
       if(l.head==null){
           l.head=n;
           l.head.next=null;
       }
       else {
           Node first = l.head;
           while (first.next != null) {
               first = first.next;
           }
           first.next = n;
           n.next=null;
       }
    }

    void reverse(LinkedList l){
       Node current=l.head;
       Node prev=null;
       Node next;
       while(current!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       head=prev;
    }

    void print(LinkedList l){
       Node first=l.head;
       while(first!=null){
           System.out.print(first.data+" ");
           first=first.next;
       }
       System.out.println();
    }

 public static void main(String args[]){
     LinkedList ll=new LinkedList();
     ll.insert_end(ll,10);
     ll.insert_end(ll,50);
     ll.insert_end(ll,20);
     ll.insert_end(ll,40);
     ll.print(ll);
     ll.reverse(ll);
     ll.print(ll);
  }
}