import java.util.*;
class partition_k{
    private static int partition_index(String s){
        int k=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') k++;
        }
        return k;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Index at which zeros and ones are equal:"+partition_index(s));
    }
}