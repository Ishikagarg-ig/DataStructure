import java.util.*;

class stackLinkedList{
 Node head;
   static class Node{
     Node next;
     int data;
    Node(int d){
      data=d;
   }
  }
 
 void push(stackLinkedList l,int d){
  Node n=new Node(d);
    Node first=n;
    first.next=l.head;
    l.head=first;
 }

 void pop(stackLinkedList l){
   if(l.head!=null){
     Node first=l.head;
     l.head=first.next;
  }
 }

 static void print(stackLinkedList l){
   Node first=l.head;
   while(first!=null){
    System.out.println(first.data);
    first=first.next;
  }
 }

 public static void main(String args[]){
   stackLinkedList l=new stackLinkedList();
   l.push(l,10);
   l.push(l,20);
   l.pop(l);
   print(l);
 }
}