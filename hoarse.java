import java.util.*;
class hoarse{
    public static int partition(int arr[], int low,int high){
        int i=low-1,j=high+1,pivot=arr[low];
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            arr[i]^=arr[j];
            arr[j]^=arr[i];
            arr[i]^=arr[j];
        }
    }
    public static void quicksort(int arr[], int low, int high){
        if(low<high){
            int p = partition(arr,low,high);
            quicksort(arr,low,p);
            quicksort(arr,p+1,high);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        quicksort(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
    }
}