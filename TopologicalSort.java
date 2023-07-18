import java.util.*;
import java.io.*;
class TopologicalSort{
	public static void addEdge(ArrayList<ArrayList<Integer>> arr,int u, int v){
		arr.get(u).add(v);
		arr.get(v).add(u);
	}
		
	public static void main(String [] args){
		int V = 6;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(V);
		for(int i=0;i<6;i++)
			arr.add(new ArrayList<Integer>());
		addEdge(arr,4,1);
		addEdge(arr,1,3);
        addEdge(arr,4,0);
        addEdge(arr,2,3);
        addEdge(arr,5,2);
        addEdge(arr,5,0);
		boolean visited[] = new boolean[V];
        System.out.print(Arrays.toString(topoSort(V,arr,visited))); 		
	}
    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> arr, boolean visited[]){
        int res[] = new int[V];
        int p=0;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<V;i++){
            if(!visited[i]) DFS(i,arr,visited,st);
        }
        while(!st.isEmpty()){
            res[p++]=st.pop();
        }
      return res;
    }
    public static void DFS(int S,ArrayList<ArrayList<Integer>> arr, boolean visited[], Stack<Integer> st){
        visited[S]=true;
        for(int u:arr.get(S)){
            if(!visited[u]) DFS(u,arr,visited,S);
        }
        st.push(S);
    }
}
