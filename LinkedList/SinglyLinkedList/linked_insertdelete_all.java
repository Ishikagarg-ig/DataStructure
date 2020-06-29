import java.util.*;

class LinkedList{
 Node head;
 static class Node{
  Node next;
  int data;
 Node(int d){
  data=d;
 }
 }
 
 void insert_end(LinkedList l,int d){
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
  
 void insert_first(LinkedList l,int d){
 Node n= new Node(d);
 Node first=n;
 first.next=l.head;
 l.head=first;
 l.head.next=first.next;
}

 void insert_bet(LinkedList l,int i,int d){
  Node n=new Node(d);
  Node bet=l.head;
  int j=0;
  while(i-1!=j){
  j++;
  bet=bet.next;
 }
 Node temp=bet.next;
 bet.next=n;
 bet=bet.next;
 bet.next=temp;
 }
  
 void delete_end(LinkedList l){
  Node last=l.head;
  while(last.next.next!=null){
    last=last.next;
 }
 last.next=null;
 }
 
 void delete_first(LinkedList l){
  Node last=l.head;
  l.head=null;
  last=last.next;
  l.head=last;
 }
  
 void delete_bet(LinkedList l,int i){
  Node bet=l.head;
  int j=0;
  while(i-1!=j){
   j++;
  bet=bet.next;
 } 
 bet.next=bet.next.next;
 bet=bet.next;
 }
 
 static void print(LinkedList l){
  Node display=l.head;
  while(display!=null){
   System.out.println(display.data);
   display=display.next;
 }
 }
  
 public static void main(String args[]){
  Scanner ss=new Scanner(System.in);
  int count=0;
  while(count!=1){
  int num=ss.nextInt();
  LinkedList l=new LinkedList(); 
      l.insert_end(l,10);
      l.insert_end(l,20);
      l.insert_end(l,30);
      l.insert_end(l,40);
      l.insert_end(l,50);
  switch(num){
   case 1:
      l.insert_end(l,60);
      print(l);
    break;
   case 2:
     l.insert_first(l,5);
     print(l);
    break;
   case 3:
      l.insert_bet(l,2,25);
      print(l);
    break;
   case 4:
      l.delete_end(l);
      print(l);
    break;
    case 5:
      l.delete_first(l);
      print(l);
    break;
   case 6:
      l.delete_bet(l,2);
      print(l);
    break; 
   case 7:
      count++;
    break;
 }
 }
 }
}