import java.util.*;
class Insertionsort{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            for(int i=1;i<n;i++){
                int key = arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
            System.out.print(Arrays.toString(arr));
        }
    }
}