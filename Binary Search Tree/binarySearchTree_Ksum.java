import java.util.*;
class BinarySearchTree{
    Node root;
    class Node{
        Node left;
        Node right;
        int data;
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
           if(root.data>d){
               root.left=insert(root.left,d);
           }
           else{
               root.right=insert(root.right,d);
           }
       }
       return root;
    }

    boolean roottoleafsum(Node root,int sum,List<Integer> result){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.data==sum){
                result.add(root.data);
                return true;
            }
            else{
                return false;
            }
        }
        if(roottoleafsum(root.left,sum-root.data,result)){
            result.add(root.data);
            return true;
        }
        if(roottoleafsum(root.right,sum-root.data,result)){
            result.add(root.data);
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        BinarySearchTree bt=new BinarySearchTree();
        bt.root=null;
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 20);
        bt.root = bt.insert(bt.root, 3);
        bt.root = bt.insert(bt.root, 12);
        bt.root = bt.insert(bt.root, 16);
        bt.root = bt.insert(bt.root, 25);
        bt.root = bt.insert(bt.root, 10);

        List<Integer> list=new ArrayList<>();
        boolean value= bt.roottoleafsum(bt.root,28,list);

        if(value==true) {
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
        else
        System.out.println("Not found");
    }
}