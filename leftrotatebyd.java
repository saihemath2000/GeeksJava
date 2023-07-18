import java.util.*;
class leftrotatebyd{
    public static void result(int arr[], int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int arr[],int low, int high){
        while(low<=high){
            int x = arr[low];
            arr[low]=arr[high];
            arr[high]=x;
            low++;
            high--;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
        result(arr,d);
        System.out.print(Arrays.toString(arr));   
    }
}