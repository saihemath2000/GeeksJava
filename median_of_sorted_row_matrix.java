//assumptions:
// odd sized matrix, distinct ele, row wise sorted
import java.util.*;
class median_of_sorted_row_matrix{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int min=arr[0][0],max=arr[0][n-1],mid=0;
        for(int i=0;i<n;i++){
            if(arr[i][0]<min) min=arr[i][0];
            if(arr[i][n-1]>max) max=arr[i][n-1];
        }
        int medpos=(n*n+1)/2,midpos;
            while(min<max){
                mid =(min+max)/2;
                midpos=0; 
                for(int i=0;i<n;i++){
                  int pos = Arrays.binarySearch(arr[i],mid)+1;
                  midpos+= Math.abs(pos);
                }
                if(medpos>midpos) min=mid+1;
                else max=mid;
            }
       System.out.print(min);  
    }
}