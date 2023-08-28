import java.util.*;
class problem_20 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int prefix[] = new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
           prefix[i]=prefix[i-1]+arr[i];
        int i=0;
        int max=Integer.MIN_VALUE;   
        for(int j=k;j<n;j++){
            max=Math.max(max,prefix[j]-prefix[i]);
            if(prefix[j-k+1]<prefix[i]) 
               i=j-k+1;
        }
        System.out.print(max);   
    }    
}
