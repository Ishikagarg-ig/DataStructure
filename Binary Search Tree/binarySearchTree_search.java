class BinaryTree{
 Node root;

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

 void search(Node first,int d){
   if(first==null){
     System.out.println(0);
  }
 else{
  if(first.data>d){
       search(first.left,d);
   }
  else if(first.data<d){
      search(first.right,d);
   }
  else if(first.data==d){
   System.out.println(first.data);
   }
 }
 }

 void print(Node first){
    if(first.left!=null){
       print(first.left);
    }
   System.out.println(first.data);
    if(first.right!=null){
       print(first.right);
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
    
    bt.search(bt.root,22);
 } 

}