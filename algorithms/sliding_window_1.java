import java.util.*;
class sliding_window_1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int i=0,j=1,max=0;
        for(j=1;j<n;j++){
            max = Math.max(max,arr[j]-arr[i]);
            if(arr[j]<arr[i])
              i=j;
        }
        System.out.print(max);
    }
}