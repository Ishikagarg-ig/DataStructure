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

 Node delete(Node root,int d){
    if(root==null)
       return root;
    if(root.data>d)
       root.left=delete(root.left,d);
    else if(root.data<d)
       root.right=delete(root.right,d);
    else{
       if(root.left== null)
          return root.left;
       else if(root.right==null)
           return root.right;

       root.data=min(root.right);
  
       root.right=delete(root.right,root.data);
    }
    return root;
 }

 int min(Node root){
    int min=root.data;
    while(root.left!=null){
        min=root.left.data;
        root=root.left;
    }
    return min;
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
    b.root=bt.delete(bt.root,70);
    bt.print(bt.root);
 } 

}