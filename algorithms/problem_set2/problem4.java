package problem_set2;
import java.util.*;
class problem4 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      int l=0,r=0,count=0;
      while(r<n){
        if(arr[r]-arr[l]>x){
        //    System.out.print(arr[l]+"-"+arr[r]+" ");
        // System.out.print(n-r+1);
           count+=(n-r);
           l++;
        }else if(arr[r]-arr[l]<=x) r++;
      }
      System.out.print(count);
    }
}
