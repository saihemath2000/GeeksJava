import java.util.*;
class Radixsort{
    public static void sort(int arr[], int exp){
        int count[] = new int[10];
        int output[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) count[(arr[i]/exp)%10]++;
        for(int i=1;i<10;i++) count[i]=count[i]+count[i-1];
        for(int i=arr.length-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1] =arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++) arr[i]=output[i];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int max=arr[0];
        for(int i=1;i<n;i++) max=Math.max(max,arr[i]);
        for(int exp=1;max/exp>0;exp=exp*10){
            sort(arr,exp);
        }
        System.out.print(Arrays.toString(arr));
    }
}