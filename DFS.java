import java.util.*;
import java.io.*;
class DFS{
	public static void addEdge(ArrayList<ArrayList<Integer>> arr,int u, int v){
		arr.get(u).add(v);
		arr.get(v).add(u);
	}
		
	public static void main(String [] args){
		int V =5;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(V);
		for(int i=0;i<5;i++)
			arr.add(new ArrayList<Integer>());
		addEdge(arr,0,1);
		addEdge(arr,0,2);
        addEdge(arr,1,3);
        addEdge(arr,2,3);
        addEdge(arr,2,4);
        addEdge(arr,3,4);
		boolean visited[] = new boolean[V];
		int S=0;
        dfs(arr,V,S,visited); 		
	}
    public static void dfs(ArrayList<ArrayList<Integer>> arr, int V, int S, boolean visited[]){
        visited[S]=true;
        System.out.print(S+" ");
        for(int u:arr.get(S)){
            if(!visited[u])
               dfs(arr,V,u,visited);
        }
    }
}