import java.util.*;
class findsubarraysum{
    public static void solve(int arr[], int sum){
        int curr=0,start=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            while(curr>sum){
                curr-=arr[start];
                start++;
            }
            if(curr==sum){
                System.out.print("Starting index is "+start+" ending index is "+ (i));
                return;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        solve(arr,sum);
    }
}