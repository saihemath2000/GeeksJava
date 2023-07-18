import java.util.*;
class Selectionsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min_index;
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index])
                   min_index=j;
            } 
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}