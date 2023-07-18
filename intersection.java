import java.util.*;
class intersection{
    public static void intersect(int arr1[], int arr2[]){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(i>0 && arr1[i-1]==arr1[i]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]>arr2[j]) j++;
            else{
               System.out.print(arr1[i]+" ");
               i++;
               j++;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();
        intersect(arr1,arr2);
    }
}