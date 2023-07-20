import java.util.*;
class leftmost_non_repeating_character{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new int[256];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==-1) arr[s.charAt(i)-'a']=i;
            else arr[s.charAt(i)-'a']=-2;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(arr[i]>=0) res=Math.min(res,arr[i]);
        }
        if(res==Integer.MAX_VALUE)
           System.out.print(-1);
        else 
           System.out.print(s.charAt(res));   
    }
}