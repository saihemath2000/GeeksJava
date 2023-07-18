import java.util.*;
class allsubsetsofastring{
    public static void printsubsets(String s, String curr, int i){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        printsubsets(s,curr,i+1);
        printsubsets(s,curr+s.charAt(i),i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printsubsets(s,"",0);
    }
}