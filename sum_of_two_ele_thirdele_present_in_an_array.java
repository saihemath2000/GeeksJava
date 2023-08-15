import java.util.*;
class sum_of_two_ele_thirdele_present_in_an_array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp=0;
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int k=0;k<n;k++){
            int l=0,r=n-1;
            while(l<r){
                if(arr[l]+arr[r]==arr[k]){
                     System.out.print("Found");
                     temp=1;
                     break;  
                }else if(arr[l]+arr[r]<arr[k]) l++;
                else r--;
            }
            if(temp==1) break;
        }
        if(temp==0) System.out.print("Not found");
    }
}