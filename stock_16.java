import java.util.*;
class stock_16{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int ans=0,i=0;
        for(int j=k;j<n;j++){
            ans=Math.max(ans,arr[j]-arr[i]);
            if(arr[j-k+1]<arr[i]) i=j-k+1;
        }
        System.out.print(ans);
    }
}