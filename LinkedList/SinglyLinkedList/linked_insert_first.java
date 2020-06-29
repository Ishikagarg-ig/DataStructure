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

 int insert_first(LinkedList l,int d){
  Node n=new Node(d);
  Node first=n;
  first.next=l.head;
  l.head=first;
  l.head.next=first.next;
  return first.data;
 }

  static void print(LinkedList l){
   Node first1=l.head;
  while(first1!=null){
   System.out.println(first1.data);
   first1=first1.next;
 }
 }

 public static void main(String args[]){
  LinkedList l =new LinkedList();
  l.insert_first(l,10);
  l.insert_first(l,20);
  l.insert_first(l,30);
  l.insert_first(l,40);
  print(l);
 }
}
