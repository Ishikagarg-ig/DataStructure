package com.company;

public class Main {

    Node head;
    class Node{
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

    void insert_first(Main l,int d){
        Node n=new Node(d);
        Node first=n;
        first.prev=null;
        first.next=l.head;
        first.next.prev=first;
        l.head=first;
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
        l.insert_first(l,5);
        print(l);
    }
}
