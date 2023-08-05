import java.util.*;
class len_largest_densestring{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int T[] = new int[s.length()*2];
        Arrays.fill(T,-1);
        int count=s.length(),ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
            else count--;
            if(count>0 && count<(2*s.length()-1)){ 
               if(T[count]<0) T[count]=i;
               if(T[count-1]>=0 && (i-T[count-1])>ans) ans=i-T[count-1];
            }
        }
        System.out.print(ans);
    }
}