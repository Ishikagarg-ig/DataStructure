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

    int checkPalindrome(LinkedList l) {
        if(head!=null){
            Node first=head;
            Node n=new Node(first.data);
            Node head1=n;
            while(first.next!=null){
                first=first.next;
                n.next=new Node(first.data);
                n=n.next;
            }
            n.next=null;

            Node prev=null;
            Node next;
            Node current=head;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;

            Node list1=head1;
            Node list2=head;
            while(list2!=null){
                if(list1.data!=list2.data){
                    return 0;
                }
                list1=list1.next;
                list2=list2.next;
            }
            return 1;
        }
        else{
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
     ll.insert_end(ll,50);
     ll.insert_end(ll,10);
     ll.print(ll);
     int result=ll.checkPalindrome(ll);
     if(result==1){
         System.out.print("Yes");
     }
     else{
         System.out.print("No");
     }
  }
}