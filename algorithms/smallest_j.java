import java.util.*;
class smallest_j{
    private static int binarysearch(int arr[],ArrayList<Integer> s,int low,int high,int key){
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[s.get(mid)]==key) return mid;
           else if(arr[s.get(mid)]<key){
            //   System.out.print(arr[s.get(mid)]+"-"+mid);
              ans= mid;
           }
           high=mid-1;
        }
        return ans;
    } 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int b[] = new int[n];
        ArrayList<Integer> s = new ArrayList<>();
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int i=0;
        while(i<n){
            if(s.isEmpty()) b[i]=i;
            else{
                int k =binarysearch(arr,s,0,s.size()-1,arr[i]);
                if(k==-1) b[i]=i;
                else b[i]=s.get(k);
            }
            if(s.isEmpty()|| arr[i]<arr[s.get(s.size()-1)]) s.add(i++);
            else i++;
            // System.out.print(s);
        }
        System.out.print(Arrays.toString(b));
    }
}