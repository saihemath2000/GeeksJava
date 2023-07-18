import java.util.*;
class lastoccurence{
    public static int find(int arr[], int x){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x) 
               high=mid-1;
            else if(arr[mid]<x) 
               low=mid+1;
            else{
                if(mid==arr.length-1||arr[mid+1]!=arr[mid])
                   return mid;
                else 
                   low=mid+1;   
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print(find(arr,x));
    }
}