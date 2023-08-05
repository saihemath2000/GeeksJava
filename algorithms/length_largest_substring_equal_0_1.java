import java.util.*;
class length_largest_substring_equal_0_1{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int T[] = new int[s.length()*2];
       Arrays.fill(T,-1);
       int c = s.length(),max=0;
       for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='1') c++;
         else c--;
         if(T[c]<0) T[c]=i;
         else{
           max = Math.max(max,i-T[c]);
         }
       }
       System.out.print("Length of the largest substring with equal 0's and 1's "+max); 
    }
}