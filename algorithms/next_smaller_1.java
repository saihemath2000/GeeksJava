import java.util.*;
class next_smaller_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),top=0;
        int arr[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int S[] = new int[n];
        // ArrayDeque<Integer> st = new ArrayDeque<>();
        ans[n-1]=n;
        // int k=n-2;
        // st.push(n-1);
        S[top++]=n-1;
        for(int i=n-2;i>=0;i--){
           while(top>0 && arr[S[top-1]]>=arr[i]) top--;
           int val = top==0?n:S[top-1];
           ans[i]=val;
           S[top++]=i;
        }
        System.out.print(Arrays.toString(ans));
    }
}