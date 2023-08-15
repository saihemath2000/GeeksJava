import java.util.*;
class cycle_in_directed_graph{
    public static void main(String [] args){
        // Scanner sc  = new Scanner(System.in);
        int V=6;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<V;i++)
          arr.add(new ArrayList<Integer>());
        addEdge(arr,0,1);
        addEdge(arr,2,1);
        addEdge(arr,2,3);
        addEdge(arr,3,4);
        addEdge(arr,4,5);
        addEdge(arr,5,3);
        System.out.print(DFS(arr,V));
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> arr, int u, int v){
        arr.get(u).add(v);
        arr.get(v).add(u);
    }
    private static boolean DFS(ArrayList<ArrayList<Integer>> arr, int V){
        boolean visited[] = new boolean[V];
        boolean recst[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(DFSR(arr,visited,recst,i,V)) return true;
            }
        }
        return false;
    }
    private static boolean DFSR(ArrayList<ArrayList<Integer>> arr, boolean visited[], boolean recst[], int S, int V){
       visited[S]=true;
       recst[S]=true;
       for(int u:arr.get(S)){
         if(!visited[u] && DFSR(arr,visited,recst,u,V)) return true;
         else if(recst[S]==true) return true;
       }
       recst[S]=false;
       return false; 
    }
}