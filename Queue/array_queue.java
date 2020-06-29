class Queue{
  
   int front=-1,rear=-1,size=5;
   int[] arr=new int[size];

    void enQueue(int d){
       if(rear==size-1){
            System.out.println("Queue is full");
        }
       else{
           System.out.println(d);
           arr[++rear]=d;
           System.out.println("Element is added here:"+rear);
        }
    }

    int deQueue(){
         if(front==-1 && rear==-1){
              System.out.println("Queue is empty");
              return -1;
         }
        else if(front==rear){
             System.out.println("Queue is empty");
             return -1;
        }
         else{
              int tmp=arr[++front];
              return tmp;
         }
    }

    public static void main(String args[]){
          Queue qq=new Queue();
          qq.enQueue(10);
          qq.enQueue(20);
          System.out.println(qq.deQueue());
    }   

}