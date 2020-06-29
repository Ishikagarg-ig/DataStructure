package com.company;

public class Main {

    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
        }
    }

    void insert_end(Main l,int d){
        Node n=new Node(d);
        if(l.head==null){
            l.head=n;
            n.prev=null;
            n.next=null;
        }
        else{
            Node first=l.head;
            while(first.next!=null){
                first.next.prev=first;
                first=first.next;
            }
            first.next=n;
            first.next.prev=first;
            n.next=null;
        }
    }

    void delete_bet(Main l,int i){
        Node first=l.head;
        int j=0;
        while(i-1!=j){
            j++;
            first.next.prev=first;
            first=first.next;
        }
        first.next.next.prev=first;
        first.next=first.next.next;
        first=first.next;
    }

    static void print(Main l){
        Node first=l.head;
        while(first!=null){
            System.out.println(first.data);
            first=first.next;
        }
    }

    public static void main(String[] args) {
        Main l=new Main();
        l.insert_end(l,10);
        l.insert_end(l,20);
        l.insert_end(l,30);
        l.insert_end(l,40);
        l.delete_bet(l,2);
        print(l);
    }
}
