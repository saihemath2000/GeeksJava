import java.util.*;
class countDigits{
    public static void main(String [] args){
        int number,count=0;
        try (Scanner sc = new Scanner(System.in)) {
            number = sc.nextInt();
        }
        while(number!=0){
            number=number/10;
            count++;
        }
        System.out.print("No of digits are "+ count);
    }
}