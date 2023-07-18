import java.util.*;
import java.io.*;
class find_index_for_which_right_ele_lesser{
    public static void result(int arr[]){
        int curr_ldr=arr[arr.length-1];
        System.out.print(curr_ldr+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(curr_ldr<arr[i]){
                curr_ldr=arr[i];
                System.out.print(curr_ldr+" ");
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
        result(arr);   
    }

}