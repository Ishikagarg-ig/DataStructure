import java.util.*;
import java.lang.*;
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

    int height(Node root){
        if(root==null){
            return 0;
        }
        int l_height=height(root.left);
        int r_height=height(root.right);
        return Math.max(l_height+1,r_height+1);
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

        int h= bt.height(bt.root);
        System.out.println(h);
    }

}