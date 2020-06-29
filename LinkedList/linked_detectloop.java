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

    int detectloop(LinkedList l){
       Node first=head,last=head;
       if(head!=null){
           return 0;
       }
       else if(head.next!=null){
           return 0;
       }
       else{
          while(last!=null && last.next!=null){
              if(first==last){
                  return 1;
              }
              first=first.next;
              last=last.next.next;
          }
          return 0;
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
     int result=ll.detectloop(ll);
     System.out.print(result);
  }
}