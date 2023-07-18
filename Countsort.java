import java.util.*;
class Countsort{
    public static void sort(int arr[], int k){
        int count[] = new int[k];
        int output[] = new int[arr.length];
        for(int i=0;i<k;i++) count[arr[i]]++;
        for(int i=1;i<k;i++) count[i]=count[i]+count[i-1];
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1] =arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++) arr[i]=output[i];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sort(arr,k);
        System.out.print(Arrays.toString(arr));
    }
}