import java.util.*;
class stock_14{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int profit=0,min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>min){
                profit=Math.max(profit,arr[i]-min);
            }else{
                min=arr[i];
            }
        }
        System.out.print(profit);
    }
}