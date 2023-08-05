package algorithms_2_21;
import java.util.*;
class print_max_window_atmostk{
   private static int[] print_max(int arr[], int k){
      int ans[] = new int[arr.length];
      int j=0;
      Deque<Integer> dq = new LinkedList<>();
      for(int i=0;i<k;i++){
          if(!dq.isEmpty() && arr[i]>=arr[dq.getLast()])
              dq.removeLast();
          dq.addLast(i);
          ans[j++]=arr[dq.getFirst()];      
      }
      for(int i=k;i<arr.length;i++){
        ans[j++]= arr[dq.getFirst()];
        while(!dq.isEmpty() && dq.peek()<=i-k)
            dq.removeFirst();
        while(!dq.isEmpty() && arr[i]>=arr[dq.getLast()]){
            dq.removeLast();
        }
        dq.addLast(i);    
      }
      ans[j-1]=arr[dq.peek()];
      return ans; 
   }
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      System.out.print(Arrays.toString(print_max(arr,k)));
   }
}