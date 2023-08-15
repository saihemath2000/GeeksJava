import java.util.*;
class dfs_topological_sort{
    private static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v){
        adj.get(u).add(v);
    }
    public static void main(String [] args){
        int V=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<Integer>());
        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        dfs(adj,V);
    }
    private static void dfs(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayDeque<Integer> st = new ArrayDeque<>();
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]) DFSR(adj,visited,st,i);
        }
        while(!st.isEmpty()){
            int val=st.pop();
            System.out.print(val+" ");
        }
    }
    private static void DFSR(ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayDeque<Integer> st, int S){
        visited[S]=true;
        for(int u:adj.get(S)){
            if(!visited[u]) DFSR(adj,visited,st,u);
        }
        st.push(S);
    }
}