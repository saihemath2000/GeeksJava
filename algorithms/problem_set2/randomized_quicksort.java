package problem_set2;
import java.util.*;
class randomized_quicksort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        RQS(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
    }
    private static void RQS(int arr[], int p, int q){
        if(p<q){
            int r = randomized_parition(arr,p,q);
            RQS(arr,p,r-1);
            RQS(arr,r+1,q);
        }
    }
    private static int randomized_parition(int arr[],int p, int q){
        Random rand = new Random();
        int index = rand.nextInt(q-p+1)+p;
        // System.out.print(index+" ");
        int temp=arr[p];
        arr[p]=arr[index];
        arr[index]=temp;
        int pivot=arr[p];
        int i=p+1,j=q;
        while(i<=j){
            while(i<=j && arr[i]<=pivot)i++;
            while(i<=j && arr[j]>pivot) j--;
            if(i<=j){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j--;
            }
        }
        i--;
        int temp1=arr[p];
        arr[p]=arr[i];
        arr[i]=temp1;
        return i;
    }
}