package com.company;

import java.util.*;

class Graph{
    int v;
    ArrayList<LinkedList<Integer>> graphlist;
    Graph(int v){
        this.v=v;
        graphlist=new ArrayList<LinkedList<Integer>>(v);
        for(int i=0;i<v;i++){
            graphlist.add(new LinkedList<Integer>());
        }
    }
    void addEdge(int v1,int v2){
        graphlist.get(v1).add(v2);
        graphlist.get(v2).add(v1);
    }
    void printGraphList(){
        for(int i=0;i<graphlist.size();i++){
            System.out.print(i);
            for(int j=0;j<graphlist.get(i).size();j++){
                System.out.print("->"+graphlist.get(i).get(j));
            }
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {
//        Scanner ss=new Scanner(System.in);
//        int V=ss.nextInt();
        int V=5;
        Graph g=new Graph(V);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraphList();
    }
}
