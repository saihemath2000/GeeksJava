import java.util.*;
class LargestSString{
    public static String findss(String s){
        int sum=0,maxlength=0,ending_index=0;
        int arr[] = new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i)-'0';  //to int
            if(arr[i]==0) arr[i]=-1;  // convert 0 to -1
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){                   //if sum store its length and end index
                maxlength=i+1;
                ending_index=i;
            }
            if(h.containsKey(sum)){
                if(maxlength<i-h.get(sum)){
                    maxlength=i-h.get(sum);
                    ending_index=i;
                }
            }else h.put(sum,i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1) arr[i]=0; 
        }
        int start = ending_index-maxlength+1;
        String ans="";
        for(int i=start;i<=ending_index;i++){
            ans+=arr[i];
        }
        if(ans=="") return "-1";
        return ans;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.print(findss(s));
    }
}