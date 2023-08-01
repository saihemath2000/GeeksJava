import java.util.*;
class sliding_window_2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int i=0,max=0;
        for(int j=l;j<n;j++){
            max = Math.max(max,arr[j]-arr[i]);
            if(arr[j-l+1]<arr[i])
              i=j-l+1;
        }
        System.out.print(max);
    }
}