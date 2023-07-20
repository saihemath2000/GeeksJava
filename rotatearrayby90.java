import java.util.*;
class rotatearrayby90{
    public static void transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                arr[i][j]^=arr[j][i];
                arr[j][i]^=arr[i][j];
                arr[i][j]^=arr[j][i];
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            while(low<high){
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
