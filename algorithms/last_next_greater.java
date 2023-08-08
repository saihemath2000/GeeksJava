import java.util.*;
class last_next_greater{
    private static int binarysearch(int arr[], int S[],int low,int high,int key){
        int ans=arr.length;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[S[mid]]==key) return arr.length;
           else if(arr[S[mid]]>key){
            //   System.out.print(arr[s.get(mid)]+"-"+mid);
              ans= mid;
              low=mid+1;
           }
           else{
            high=mid-1;
           }
        }
        return ans;
    } 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int b[] = new int[n];
        int S[] = new int[n];
        int top=n-1;
        // ArrayList<Integer> s = new ArrayList<>();
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int i=n-1;
        while(i>=0){
            if(top==n-1) b[i]=n;
            else{
                int k =binarysearch(arr,S,top+1,n-1,arr[i]);
                if(k==n) b[i]=n;
                else b[i]=S[k];
            }
            if(top==n-1|| arr[i]>arr[S[top+1]]) S[top--]=i--;
            else i--;
            // System.out.print(s);
        }
        System.out.print(Arrays.toString(b));
    }
}