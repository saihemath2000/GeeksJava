import java.util.*;
class longest_subarray_size_with_given_sum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int pre_sum=0,res=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            pre_sum+=arr[i];
            if(pre_sum==k) res=i+1;
            if(h.containsKey(pre_sum)==false) h.put(pre_sum,i);
            if(h.containsKey(pre_sum-k)){
                res= Math.max(res,i-h.get(pre_sum-k));
            }
        }
        System.out.print(res);
    }
}