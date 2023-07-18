import java.util.*;
class isPalindrome{
    public static void main(String [] args){
        int number,reverse=0,temp;
        try (Scanner sc = new Scanner(System.in)) {
            number = sc.nextInt();
        }
        temp=number;
        while(temp!=0){
            reverse=reverse*10+(temp%10);
            temp=temp/10;
        }
        if(reverse==number){
            System.out.print("Number "+number+" is a palindrome");
        }
        else{
            System.out.print("Number "+number+" is not a palindrome");
        }
    }
}