import java.util.*;
class medianoftwosortedarrays{
    public static int findmedian(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int begin1=0,end1=n1;
        while(begin1<=end1){
            int mid1=(begin1+end1)/2;
            int mid2=(n1+n2+1)/2-mid1;
            int max1=(mid1==0)?Integer.MIN_VALUE:arr1[mid1-1];
            int min1=(mid1==n1)?Integer.MAX_VALUE:arr1[mid1];
            int max2=(mid2==0)?Integer.MIN_VALUE:arr2[mid2-1];
            int min2=(mid2==n2)?Integer.MAX_VALUE:arr2[mid2];
            if(max1<=min2 && max2<=min1){
                if((n1+n2)%2==0)
                  return (Math.max(max1,max2)+Math.min(min1,min2))/2;
                else 
                  return Math.max(max1,max2);  
            }else if(max1>min2) end1=mid1-1;
            else begin1=mid1+1;
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();
        System.out.print(findmedian(arr1,arr2));
    }
}