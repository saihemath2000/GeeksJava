import java.util.*;
class primeFactors{
    public static void main(String [] args){
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            number =sc.nextInt();
        }
        if(number<=1){
            System.out.print("there are no prime factors");
        }
        while(number%2==0){
            System.out.print(2+" ");
            number=number/2;
        }
        while(number%3==0){
            System.out.print(3+" ");
            number=number/3;
        }
        for(int i=5;i*i<=number;i+=6){
            while(number%i==0){
                System.out.print(i+" ");
                number=number/i;
            }
            while(number%(i+2)==0){
                System.out.print(i+2+" ");
                number=number/(i+2);
            }
        }
        if(number>3){
            System.out.print(number);
        }
    }
}