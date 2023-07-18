import java.util.*;
class dutch_national_flag{
    public static void dutch(int arr[]){
        int low=0,high=arr.length-1,mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                arr[mid]^=arr[low];
                arr[low]^=arr[mid];
                arr[mid]^=arr[low];
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                arr[mid]^=arr[high];
                arr[high]^=arr[mid];
                arr[mid]^=arr[high];
                high--;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        dutch(arr);
        System.out.print(Arrays.toString(arr));
    }
}