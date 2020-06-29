class BinaryTree{
 Node root;
 Node head;
 Node prev=null;

 class Node{
   int data;
   Node left;
   Node right;
   Node(int d){
       data=d;
  }
 }



 Node insert(Node root,int d){
   Node n=new Node(d);
   if(root==null){
      root=n;
   }
  else{
    if(root.data>n.data){
         root.left=insert(root.left,n.data);
      }
   else{
        root.right=insert(root.right,n.data);  
     }
   }
  return root;
 }

 void binarytodoubly(Node root){
     if(root==null){
         return;
     }
     binarytodoubly(root.left);

     if(prev==null){
         head=root;
     }
     else{
         prev.right=root;
     }
     prev=root;

     binarytodoubly(root.right);
 }

 void print(Node first){
    while(first!=null){
        System.out.println(first.data);
        first=first.right;
    }
 }
 
 public static void main(String args[]){
    BinaryTree bt=new BinaryTree();
    bt.root=null;
    bt.root=bt.insert(bt.root,60);
    bt.root=bt.insert(bt.root,15);
    bt.root=bt.insert(bt.root,50);
    bt.root=bt.insert(bt.root,10);
    bt.root=bt.insert(bt.root,22);
    bt.root=bt.insert(bt.root,35);
    bt.root=bt.insert(bt.root,70);
    bt.binarytodoubly(bt.root);
    bt.print(bt.head);
 } 

}