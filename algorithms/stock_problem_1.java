import java.util.*;
class stock_problem_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int top=0,diff=0;
        int S[] = new int[n];
        for(int i=0;i<n;i++){
            if(top==0) S[top++]=arr[i];
            else{
                if(top>0 && S[top-1]<arr[i]){
                    diff=Math.max(diff,arr[i]-S[top-1]);
                }
                else if(top>0 && S[top-1]>arr[i]){
                    top--;
                    S[top++]=arr[i];
                }
            }
        }
        System.out.print(diff); 
    }
}
