import java.util.*;
class slidingwindow{
    public static int solve(int arr[],int k){
         int curr=0;
         for(int i=0;i<k;i++) curr+=arr[i];
         int res=curr;
         for(int i=k;i<arr.length;i++){
            curr+=(arr[i]-arr[i-k]);
            res=Math.max(res,curr);
         }
         return res;    
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print(solve(arr,k));
    }
}