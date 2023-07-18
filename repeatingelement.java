//This code is also used to find first element of a loop in a linkedlist
//constraints for this code, all ele are present from 1 to max(arr)
//1<=max(arr)<=n-1
import java.util.*;
class repeatingelement{
    public static int findRE(int arr[]){
        int slow=arr[0],fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print(findRE(arr));
    }
}