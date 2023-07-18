import java.util.*;
import java.io.*;
class BFS{
	public static void addEdge(ArrayList<ArrayList<Integer>> arr,int u, int v){
		arr.get(u).add(v);
		arr.get(v).add(u);
	}
		
	public static void main(String [] args){
		int V = 3;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(V);
		for(int i=0;i<3;i++)
			arr.add(new ArrayList<Integer>());
		addEdge(arr,0,1);
		addEdge(arr,0,2);
        addEdge(arr,1,2);
		boolean visited[] = new boolean[V];
		int S=0;
        bfs(arr,V,S,visited); 		
	}
	public static void bfs(ArrayList<ArrayList<Integer>> arr, int V, int S, boolean visited[]){
		visited[S]=true;
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(S);
		while(!q.isEmpty()){
			int curr=q.poll();
			System.out.print(curr+" ");
			for(int u:arr.get(curr)){
				if(visited[u]==false){
					visited[u]=true;
					q.add(u);
				}
			}
		}
	}
		
}