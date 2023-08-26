package problem_set2;
import java.util.*;
class randomized_find_rank{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rank = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        int l=0,r=n-1;
        System.out.print(arr[FindRank(arr,l,r,rank)]);
    }
    private static int FindRank(int arr[],int l, int r, int rank){
        int k=partition(arr,l,r);
        if(rank==r-k+1) return k;
        if(rank<r-k+1) 
          return FindRank(arr,k+1,r,rank);
        else 
         return FindRank(arr,l,k-1,rank-(r-k+1));
    }
    private static int partition(int arr[],int p,int q){
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