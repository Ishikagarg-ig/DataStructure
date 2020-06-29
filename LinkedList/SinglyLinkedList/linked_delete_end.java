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
 
  int insert_end(LinkedList l,int d){
   Node n=new Node(d);
  if(l.head==null){
   l.head=n;
   n.next=null;
   return l.head.data;
 }
 else{
    Node last=l.head;
    while(last.next!=null){
      last=last.next;
    }
   last.next=n;
   n.next=null;
   return last.next.data;
  }
 }
  
 void remove_end(LinkedList l,int d){
  Node n=new Node(d);
  Node rlast=l.head;
   while(n.data!=rlast.next.data){
    rlast=rlast.next;
  } 
 Node temp=rlast.next;
  rlast.next=null;
 }

  static void print(LinkedList l){
    Node last1=l.head;
    while(last1!=null){
    System.out.println(last1.data);
    last1=last1.next;
  }
  }

 public static void main(String args[]){
   LinkedList l=new LinkedList();
    l.insert_end(l,10);
    l.insert_end(l,20);
    l.insert_end(l,30);
    l.remove_end(l,30);
   print(l);
 }
}