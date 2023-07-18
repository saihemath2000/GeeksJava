import java.util.*;
class GCD{
    static int isGCD(int m, int n){
        return n==0 ? m:isGCD(n,m%n);
    }
    public static void main(String [] args){
        int a,b;
        try (Scanner input1 = new Scanner(System.in)) {
        try (Scanner input2 = new Scanner(System.in)) {
            a = input1.nextInt();
            b = input2.nextInt();
        }
        }
        System.out.print(isGCD(a,b));
    }
}