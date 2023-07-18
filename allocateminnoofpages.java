import java.util.*;
class allocateminnoofpages{
    public static boolean isfeasible(int arr[], int k, int mid){
        int req=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                req++;
                sum=arr[i];
            }else sum+=arr[i];
        }
        return (req<=k);
    }
    public static int minpages(int arr[], int k){
        int sum=0,maxno=0,res=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxno= Math.max(maxno,arr[i]);
        }
        int begin=maxno,end=sum;
        while(begin<=end){
            int mid=(begin+end)/2;
            if(isfeasible(arr,k,mid)){
                res=mid;
                end=mid-1;
            }else{
                begin=mid+1;
            }
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print(minpages(arr,k));
    }
}