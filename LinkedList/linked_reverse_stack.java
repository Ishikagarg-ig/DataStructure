import java.util.*;

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
       Stack<Node> st=new Stack<>();
       Node first=head;
       while(first!=null){
           st.push(first);
           first=first.next;
       }
       while(!st.isEmpty()) {
           System.out.print(st.pop().data + " ");
       }
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
     //ll.print(ll);
  }
}