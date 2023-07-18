import java.util.*;
class Mergesort{
    public static void merge(int arr[], int low, int mid,int high){
        int n1=mid-low+1,n2=high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[low+i];
        for(int i=0;i<n2;i++) right[i]=arr[mid+i+1];
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];
    }
    public static void mergesort(int arr[], int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        mergesort(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
    }
}