import java.util.*;
class basicstock{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int min=arr[0],diff=0;
        for(int i=1;i<n;i++){
            if(arr[i]>min) diff=Math.max(diff,arr[i]-min);
            else{
                min=arr[i];
            }
        }
        System.out.print(diff);
    }
}