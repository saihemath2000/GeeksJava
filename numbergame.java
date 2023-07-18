import java.util.*;
class numbergame{
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int ans=1;
        for(int i=2;i<=number;i++){
            ans=(ans*i)/gcd(ans,i)%1000000007;
            // System.out.print(ans+" ");
        }
        System.out.print(ans);
    }
    public static int gcd(int a, int b){
        if(a==0)
          return b;
        else
          return gcd(b%a,a);  
    }
}