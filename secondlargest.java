import java.util.*;
class secondlargest{
    public static int findsecondlargest(int arr[]){
        int res=-1,largest=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]>largest){
                res=largest;
                largest=j;
            }
            else if(arr[j]!=arr[largest]){
                if(res==-1 || arr[j]>res){
                    res=j;
                }
            }
        }
        return arr[res];
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        System.out.print("second largest ele is "+findsecondlargest(arr));  
    }
}