class Queue{
    static int size=10;
    static int front=-1,rear=-1;
    static int[] arr=new int[size];

    void enqueue(int d){
        if((rear==size-1 && front==0) && rear==(front-1)%size){
            System.out.println("Queue is full");
        }
        if(front==-1){
            rear=front=0;
        }
        else if(rear==size-1 && front!=0){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=d;
    }

    int dequeue(){
        if(front==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
        int tmp=arr[front];
        if(front==size-1){
            front=0;
        }
        else if(rear==front){
            rear=front=-1;
        }
        else{
            front++;
        }
        return tmp;
    }

    public static void main(String[] args){
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        int x=q.dequeue();
        System.out.println(x);
        int x1=q.dequeue();
        System.out.println(x1);
        int x2=q.dequeue();
        System.out.println(x2);
        int x3=q.dequeue();
        System.out.println(x3);
    }
}