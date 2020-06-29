class CircularLinkedList{
Node head,tail;
 static class Node{
  int data;
  Node next;
  Node(int d){
  data=d;
 }
 }
 void insert_end(CircularLinkedList l,int d){
  Node n=new Node(d);
  if(l.head==null){
    l.head=n;
    l.tail=n;
    n.next=l.head;
 }   
  else{
   l.tail.next=n;
   l.tail=n;
   n.next=l.head;
 }
 }

 void delete_end(CircularLinkedList l){
  Node last=l.head;
  while(last.next!=l.tail){
  last=last.next;
 }
 l.tail=last;
 } 

 static void print(CircularLinkedList l){
  Node last=l.head;
   System.out.println(l.head.data);
   while(last!=l.tail){
   last=last.next;
   System.out.println(last.data);
 }
 }
 
 public static void main(String args[]){
  CircularLinkedList l=new CircularLinkedList();
  l.insert_end(l,10);
  l.insert_end(l,20);
  l.insert_end(l,30);
  l.delete_end(l);
  print(l);
 }
}