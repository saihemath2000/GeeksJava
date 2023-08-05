package algorithms_2_21;
import java.util.*;
class print_max_window_atmostk_1{
   private static int[] print_max(int arr[], int k){
      int ans[] = new int[arr.length];
	  int S[] = new int[arr.length];
      int j=0,l=0,top=0;
      for(int i=0;i<k;i++){
          if(top>0 && arr[i]>=arr[S[top-1]])
		      top--;
          S[top++]=i;
          ans[j++]=arr[S[l]];      
      }
      for(int i=k;i<arr.length;i++){
        ans[j++]= arr[S[l]];
        while(top>0 && S[l]<=i-k)
           l++;
        while(top>0 && arr[i]>=arr[S[top-1]]){
            top--;
        }
        S[top++]=i;    
      }
      ans[j-1]=arr[S[--top]];
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