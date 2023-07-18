import java.util.*;
class isPrime{
    public static void main(String [] args){
        int number,temp=0;
        try (Scanner scan = new Scanner(System.in)) {
            number = scan.nextInt();
        }
        if(number==1){
            System.out.print("Number "+number+" is not a prime number");
        }
        else if(number==2 || number==3){
           System.out.print("Number "+number+" is a prime number");
        }
        else if(number%2==0 || number%3==0){
            System.out.print("Number "+number+" is not a prime number");
        }
        else{
        for(int i=5; i*i<=number;i+=6){
            if(number%i==0 || number%(i+2)==0){
                temp=1;
                System.out.print("Number "+number+" is not a prime number");
                break;
            }
        }
       }
       if(temp==0){
        System.out.print("Number "+number+" is a prime number");
       }
    }
}