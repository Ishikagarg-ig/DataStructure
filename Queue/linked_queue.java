class Queue{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    void enqueue(Queue q,int d){
        Node n=new Node(d);
        if(q.head==null){
            head=n;
            n.next=null;
        }
        else{
            Node first=head;
            while(first.next!=null){
                first=first.next;
            }
            first.next=n;
            n.next=null;
        }
    }
    void dequeue(Queue q){
        Node first=head;
        head=first.next;
    }
    void print(Queue q){
        Node first=q.head;
        while(first!=null){
            System.out.println(first.data);
            first=first.next;
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.enqueue(q,10);
        q.enqueue(q,20);
        q.enqueue(q,30);
        q.dequeue(q);
        q.print(q);
    }
}