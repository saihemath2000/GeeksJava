import java.util.*;
class Heapsort{
    public static void buildheap(int arr[], int n){
        for(int i=(arr.length/2-1);i>=0;i--)
           maxheapify(arr,n,i);
    }
    public static void maxheapify(int arr[], int n, int i){
        int largest=i,left=2*i+1,right=2*i+2;
        if(left<n && arr[left]>arr[largest]) largest=left;
        if(right<n && arr[right]>arr[largest]) largest=right;
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            maxheapify(arr,n,largest);
        }
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            buildheap(arr,n);
            for(int i=n-1;i>0;i--){
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
                maxheapify(arr,i,0);
            }
            System.out.print(Arrays.toString(arr));
        }
    }
}