import java.util.*;
class stock_17{
    private int[] atmost(int arr[],int k){
        int n=arr.length;
        int l=0,top=0;
        int S[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(top>=k && arr[S[top-1]]>=arr[i]) top--;
            S[top++]=i;
            if(S[top-1]-S[k]+1>k) l++;
            ans[i]= S[l];
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int B[] = atmost(arr,k);
        int i=0;max=0;
        for(int j=1;j<n;j++){
            if(arr[j]-arr[i]>max) max=arr[j]-arr[i];
            i=B[j];
        }
        System.out.print(max);
    }
}