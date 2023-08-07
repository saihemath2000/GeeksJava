import java.util.*;
class last_previous_smaller{
    private static int binarysearch(int arr[], int S[],int low,int high,int key){
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[S[mid]]==key) return -1;
           else if(arr[S[mid]]<key){
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
        int S[] = new int[n];
        int top=0;
        // ArrayList<Integer> s = new ArrayList<>();
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int i=0;
        while(i<n){
            if(top==0) b[i]=-1;
            else{
                int k =binarysearch(arr,S,0,top-1,arr[i]);
                if(k==-1) b[i]=-1;
                else b[i]=S[k];
            }
            if(top==0|| arr[i]<arr[S[top-1]]) S[top++]=i++;
            else i++;
            // System.out.print(s);
        }
        System.out.print(Arrays.toString(b));
    }
}