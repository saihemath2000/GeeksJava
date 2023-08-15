import java.util.*;
class kahns_topological_sort{
    static int indegree[];
    private static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v){
        adj.get(u).add(v);
        indegree[v]++;
    }
    public static void main(String [] args){
        int V=5;
        indegree= new int[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<Integer>());
        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int val=q.poll();
            System.out.print(val+" ");
            for(int u:adj.get(val)){
                indegree[u]--;
                if(indegree[u]==0) q.add(u);
            }
        }
    }
}