import java.util.*;
class maxsumsubarray{
    public static int find(int arr[]){
        int maxending=arr[0],res=arr[0];
        for(int i=1;i<arr.length;i++){
            maxending = Math.max(maxending+arr[i],arr[i]);
            res = Math.max(maxending,res);
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print(find(arr));
    }
}