import java.util.*;
class problem21{
    private static int[] atmost(int arr[],int k){
        int n=arr.length;
        int l=0,top=0;
        int S[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(top>l && arr[S[top-1]]>arr[i]) top--;
            S[top++]=i;
            if(S[top-1]-S[l]+1>k) l++;
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
        int prefix[] = new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int B[] = atmost(prefix,k);
        System.out.print(Arrays.toString(B));
        int i=0,max=prefix[0];
        for(int j=1;j<n;j++){
            if(prefix[j]-prefix[i]>max) max=prefix[j]-prefix[i];
            i=B[j];
            // System.out.print(i+" ");
        }
        System.out.print(max);
    }
}