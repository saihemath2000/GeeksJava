import java.util.*;
class subarray_with_zero_sum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int pre_sum=0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            pre_sum+=arr[i];
            if(h.contains(pre_sum)|| pre_sum==0) System.out.print(true);
            else h.add(pre_sum); 
        }
        System.out.print(false);
    }
}