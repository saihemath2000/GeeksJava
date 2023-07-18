import java.util.*;
class removeduplicates{
    public static int[] result(int arr[]){
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return Arrays.copyOfRange(arr, 0,j-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
        System.out.print(Arrays.toString(result(arr)));   
    }
}