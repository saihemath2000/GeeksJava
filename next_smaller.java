import java.util.*;
class next_smaller{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        ArrayDeque<Integer> st = new ArrayDeque<>();
        ans[n-1]=n;
        // int k=n-2;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
           while(!st.isEmpty() && arr[st.peek()]>arr[i]) st.pop();
           int val = st.isEmpty()?n:st.peek();
           ans[i]=val;
           st.push(i);
        }
        System.out.print(Arrays.toString(ans));
    }
}