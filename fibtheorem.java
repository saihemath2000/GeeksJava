import java.util.*;
class fibtheorem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        arr[0]=0;
        arr[1]=1;
        int p=2;
        for(p=2;p<(6*m)+1;p++){
            arr[p]=(arr[p-1]+arr[p-2])%m;
            if(arr[p-1]==0 && arr[p]==1) break;
        }
        p--;
        System.out.print(arr[n%p]);
    }
}