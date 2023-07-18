import java.util.*;
class printFactors{
    public static void main(String [] args){
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            number = scan.nextInt();
        }
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
                // number=number/i;
                if(i!=number/i){
                    System.out.print(number/i+" ");
                }
            }
        }
    }
}