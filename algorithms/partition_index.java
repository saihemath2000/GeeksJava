import java.util.*;
class partition_index{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count0=0,count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                count1++;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') count0++;
            else{
                if(s.charAt(i)=='1') count1--;
            }
            if(count0==count1){
                System.out.print(i);
                break;
            }
        }
    }
}