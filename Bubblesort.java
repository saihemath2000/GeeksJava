import java.util.*;
class Bubblesort{
    public static void main(String[] args){
        boolean swapped=false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]^=arr[j+1];
                    arr[j+1]^=arr[j];
                    arr[j]^=arr[j+1];
                    swapped=true;
                }
            } 
            if(swapped==false) break;
        }
        System.out.print(Arrays.toString(arr));
    }
}