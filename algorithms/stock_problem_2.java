import java.util.*;
class stock_problem_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int diff=0;
        for(int i=0;i<n-k;i++){
            diff = Math.max(diff,arr[i+k]-arr[i]);
        }
        System.out.print(diff); 
    }
}
