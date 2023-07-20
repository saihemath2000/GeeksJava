import java.util.*;
class longest_common_span_with_same_sum_binaryarrays{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int temp[] = new int[n];
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n;i++) arr2[i]=sc.nextInt();
        for(int i=0;i<n;i++) temp[i]=arr1[i]-arr2[i];
        HashMap<Integer,Integer> h = new HashMap<>();
        int pre_sum=0,res=0;
        for(int i=0;i<n;i++){
            pre_sum+=temp[i];
            if(pre_sum==0) res=i+1;
            if(h.containsKey(pre_sum)==false) h.put(pre_sum,i);
            if(h.containsKey(pre_sum)) res=Math.max(res,i-h.get(pre_sum));
        }
        System.out.print(res);
    }
}