import java.util.*;
class union{
    public static void union(int arr1[],int arr2[]){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(i>0 && arr1[i-1]==arr1[i]){
                i++;
                continue;
            }
            if(j>0 && arr2[j-1]==arr2[j]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            while(i<arr1.length){
                if(i==0 || arr1[i]!=arr1[i-1]){
                    System.out.print(arr1[i]+" ");
                    i++;
                }
            }
            while(j<arr2.length){
                if(j==0 || arr2[j]!=arr2[j-1]){
                    System.out.print(arr2[j]+" ");
                    j++;
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int arr1[]= new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        for(int j=0;j<n2;j++) arr2[j]=sc.nextInt();
        union(arr1,arr2);
    }
}