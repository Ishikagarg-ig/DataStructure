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
    void BFS(int v,boolean visited[]){
        Queue<Integer> st=new LinkedList<>();
        st.add(v);
        while (st.size()!=0){
            int vrt=st.poll();
            if(!visited[vrt]) {
                visited[vrt]=true;
                System.out.print(vrt+" ");
            }
            Iterator<Integer> it=graphlist.get(vrt).listIterator();
            while (it.hasNext()){
                int n=it.next();
                if(!visited[n]){
                    st.add(n);
                }
            }
        }
    }
    void BFS(int startVertex){
        boolean[] visited=new boolean[v];
        BFS(startVertex,visited);
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

        g.BFS(2);
    }
}
