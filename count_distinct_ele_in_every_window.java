import java.util.*;
class count_distinct_ele_in_every_window{
    public static void main(String [] args){
        HashMap<Integer,Integer> h = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int arr[] = new int[n];
        int index=1;
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        //for first window
        for(int i=0;i<k;i++) h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        System.out.println("no of distinct ele in window "+index+" is "+h.size());
        for(int i=k;i<n;i++){
            h.put(arr[i-k],h.get(arr[i-k])-1);
            if(h.get(arr[i-k])==0) h.remove(arr[i-k]);
            if(!h.containsKey(arr[i])) h.put(arr[i],1);
            else h.put(arr[i],h.get(arr[i])+1);
            index++;
            System.out.println("no of distinct ele in window "+index+" is "+h.size());
        }  
    }
}