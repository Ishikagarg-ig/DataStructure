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

 Node mirrorify(Node root){
     if(root==null){
         return null;
     }
     Node mirror=new Node(root.data);
     mirror.right=mirrorify(root.left);
     mirror.left=mirrorify(root.right);
     return mirror;
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
    
    Node mirror=bt.mirrorify(bt.root);
    bt.print(mirror);
 } 

}