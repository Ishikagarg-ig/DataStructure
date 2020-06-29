import java.util.*;

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

 void levelorder(Node root){
     Queue<Node> q=new LinkedList<>();
     q.add(root);
     while(q.size()!=0){
         Node x=q.remove();
         System.out.println(x.data);
         if(x.left!=null){
             q.add(x.left);
         }
         if(x.right!=null){
             q.add(x.right);
         }
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
    
    bt.levelorder(bt.root);
 } 

}