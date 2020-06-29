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

 void bubble_sort(LinkedList l){
   for(Node last=head;last!=null;last=last.next){
       for(Node last1=head;last1!=null;last1=last1.next){
             if(last.data<last1.data){
                    int temp=last.data;
                     last.data=last1.data;
                     last1.data=temp;
           }
    }
  }
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
    l.insert_end(l,5);
    l.insert_end(l,80);
    l.insert_end(l,50);
    l.bubble_sort(l);
   print(l);
 }
}