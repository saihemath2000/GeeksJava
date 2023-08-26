package problem_set2;

import java.util.*;

class problem5 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      int temp=0;
      boolean flag=false;
      Arrays.sort(arr);
      for(int k=0;k<n;k++){
        int low=0,high=n-1;
        while(low<high){
            if(arr[low]+arr[high]==arr[k]){
                flag=true;
                temp=1;
                break;
            }
            else if(arr[low]+arr[high]<arr[k]) low++;
            else high--;
        }
        if(temp==1) break;
      }
      System.out.print(flag);
    }
}
