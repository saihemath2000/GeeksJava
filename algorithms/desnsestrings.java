import java.util.*;
class desnsestrings{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start=0,onesCount=0,zerosCount=0,ans=0;
        for(int end=0;end<s.length();end++){
            if(s.charAt(end)=='1') onesCount++;
            else zerosCount++;
            while(zerosCount>onesCount){
                if(s.charAt(start)=='1') onesCount--;
                else zerosCount--;
                start++;
            }
            if(onesCount>zerosCount){
                ans++;
                // if(end-start+1>maxlength){
                //     maxlength=end-start+1;
                //     maxstart=start;  
                // }
            }
        }
        // if(maxstart==-1) System.out.print("");
        // System.out.println(s.substring(maxstart,maxstart+maxlength));
        System.out.print("No of such dense substrings are "+ans);
    }
}