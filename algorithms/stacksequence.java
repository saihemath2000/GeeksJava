import java.util.*;
class stacksequence{
    private static boolean validate(int arr[], int popped[]){
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int j=0;
        for(int i:arr){
            st.push(i);
            while(!st.isEmpty() && popped[j]==st.peek()){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int popped[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++) popped[i] = sc.nextInt();
        System.out.print(validate(arr,popped));
    }
}