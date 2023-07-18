import java.util.*;
class kthsmallest{
    public static int partition(int arr[], int low,int high){
        int i=low-1,temp=0;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int low=0,high=n-1,temp=0;
        while(low<=high){
            int p = partition(arr,low,high);
            if(p==k-1){
              System.out.print(arr[p]);
              temp=1;
              break;
            }
            else if(p>k-1) high=p-1;
            else low=p+1;
        }
        if(temp==0)
        System.out.print("no kth smallest element found");
    }
}