import java.util.*;
class median_of_row_sorted_matrix{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //no of rows
        int m=sc.nextInt(); //no of cols
        int matrix[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int min=matrix[0][0],max=matrix[0][m-1];
        for(int i=1;i<n;i++){
            min=Math.min(min,matrix[i][0]);
            max=Math.max(max,matrix[i][m-1]);
        }
        int medpos=(n*m+1)/2;
        while(min<max){
            int mid=(min+max)/2,midpos=0;
            for(int i=0;i<n;i++){
                int index= Arrays.binarySearch(matrix[i],mid)+1;
                // System.out.print(index+" ");
                midpos+=Math.abs(index);
            }
            if(midpos<medpos)
                min=mid+1;
            else
                max=mid;     
        }
        System.out.print(min);
    }
    // private static int bs(int arr[],int key){
    //     int low=0,high=arr.length-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]==key) return mid;
    //         else if(arr[mid]<key){
    //             low=mid+1;
    //         }
    //         else{
    //             return mid-1;
    //         }
    //     }
    //     return high;
    // }
}