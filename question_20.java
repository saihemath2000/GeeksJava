import java.util.*;
class question_20{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=0;i<k;i++) sum1+=arr[i];
        int ans=sum1;
        for(int i=k;i<n;i++){
            sum1+=arr[i];
            sum2+=arr[i-k];
            ans=Math.max(ans,sum1);
            if(sum2<0){
                sum1-=sum2;
                sum2=0;
            }
        }
        System.out.print(ans);
    }
}