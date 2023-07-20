import java.util.*;
class longest_consecutive_subsequence_array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        HashSet<Integer> h = new HashSet<>();
        for(int x:arr) h.add(x);
        int res=0;
        for(int x:h){
            if(h.contains(x-1)==false){
               int curr=1;
               while(h.contains(x+curr)){  
                 curr++;
               }
               res=Math.max(res,curr);
            }
        }
        System.out.print(res);
    }
}