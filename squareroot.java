import java.util.*;
class squareroot{
    public static int bs(int x){
        int low=0,high=x,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int msq=mid*mid;
            if(msq>x)
              high=mid-1;
            else if(msq==x)
              return mid;
            else{
                low=mid+1;
                ans=mid;
            }    
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(bs(x));
    }
}