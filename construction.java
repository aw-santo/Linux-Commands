package com.pavan.Graph;

import java.util.ArrayList;

public class construction {
    public static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void construct(){
        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for(int i=0;i<N;i++){
            graph[i] = new ArrayList<Edge>();
        }
        addEdge(graph,0,1,10);
        addEdge(graph,0,3,10);
        addEdge(graph,1,2,10);
        addEdge(graph,2,3,40);
        addEdge(graph,3,4,2);
        addEdge(graph,4,5,2);
        addEdge(graph,5,6,3);
        addEdge(graph,4,6,4);
        
        
        display(graph,N);
    }

    private static void display(ArrayList<Edge>[] graph, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for(Edge e : graph[i]){
                int u = e.src;
                int v = e.nbr;
                int w = e.wt;
                System.out.print(u + " - " + v + " @ " + w +" , " );
            }
            System.out.println();

        }
    }

    private static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u,v,w));
        graph[v].add(new Edge(v,u,w));  //because the graph is undirected
    }

    public static void main(String[] args) {
        construct();
    }
}
