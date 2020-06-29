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

 void insert_first(CircularLinkedList l,int d){
 Node n=new Node(d);
 Node first=n;
 first.next=l.head;
 l.head=n;
 l.tail.next=l.head;
 }

 static void print(CircularLinkedList l){
  Node last=l.head;
   System.out.println(last.data);
   while(last!=l.tail){
  last=last.next;
   System.out.println(last.data);
 }
 } 

 public static void main(String args[]){
  CircularLinkedList l=new CircularLinkedList();
  l.insert_end(l,10);
  l.insert_end(l,20);
  l.insert_first(l,5);
  print(l);
 }
}