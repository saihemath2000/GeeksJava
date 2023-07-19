import java.util.*;
class moreonesthanzeros{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxlength=-1,maxstart=-1,start=0,onesCount=0,zerosCount=0;
        for(int end=0;end<s.length();end++){
            if(s.charAt(end)=='1') onesCount++;
            else zerosCount++;
            while(zerosCount>onesCount){
                if(s.charAt(start)=='1') onesCount--;
                else zerosCount--;
                start++;
            }
            if(onesCount>zerosCount && end-start+1>maxlength){
                maxlength=end-start+1;
                maxstart=start;
            }
        }
        if(maxstart==-1) System.out.print("");
        System.out.print(s.substring(maxstart,maxstart+maxlength));
    }
}