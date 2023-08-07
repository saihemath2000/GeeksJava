import java.util.*;
class previous_greater{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int top=0;
        int S[] = new int[n];
        int ans[] = new int[n];
        ans[0]=-1;
        S[top++]=0;
        for(int i=1;i<n;i++){
            while(top>0 && arr[S[top-1]]<=arr[i]) top--;
            int val = (top==0)?-1:S[top-1];
            ans[i]=val;
            S[top++]=i;
        }
        System.out.print(Arrays.toString(ans));
    }
}