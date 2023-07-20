import java.util.*;
class jaggedarray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++){
            arr[i]= new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}