import java.util.*;
class printpowerset{
    public static void powerset(String s){
        int n= s.length();
        int plen = (1<<n);
        for(int i=0;i<plen;i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                //   System.out.print(i+"-"+j+"-"+(1<<j));  
                  System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        powerset(s);
    }
}