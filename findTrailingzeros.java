import java.util.*;
class findTrailingzeros{
    public static void main(String [] args){
        int number,count=0;
        try (Scanner scan = new Scanner(System.in)) {
            number = scan.nextInt();
        }
        if(number<0){
            System.out.print(-1);
        }
        for(int i=5; number/i>=1; i=i*5){
            count=count+number/i;
        }
        System.out.print(count);
    }
}