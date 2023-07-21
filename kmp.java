import java.util.*;
class kmp{
    public static void filllps(String pat,int lps[]){
        lps[0]=0;
        int i=1,len=0;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0){lps[i]=0;i++;}
                else{
                    len=lps[len-1];
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pat= sc.nextLine();
        int i=0,j=0;
        int lps[] = new int[pat.length()];
        filllps(pat,lps);
        while(i<txt.length()){
            if(txt.charAt(i)==pat.charAt(j)){i++;j++;}
            if(j==pat.length()){
                System.out.print(i-j+" ");
                j=lps[j-1];
            }else if(i<txt.length() && txt.charAt(i)!=pat.charAt(j)){
                if(j==0) i++;
                else{
                    j=lps[j-1];
                }
            }
        }
    }
}