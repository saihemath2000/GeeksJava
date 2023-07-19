import java.util.*;
class permutationsofstring{
    static int index=1;
    public static void permute(String s, int i){
        //  String temp="";

         if(i==s.length()-1){
            System.out.println(index+"."+s);
            index++;
         }
         else{
            for(int j=i;j<=s.length()-1;j++){
              s = swap(s,i,j);
              permute(s,i+1);
              s= swap(s,i,j);
            }
        }
    }
    public static String swap(String s, int i, int j){
        char chararray[] = s.toCharArray();
        char temp1= chararray[i];
        chararray[i]=chararray[j];
        chararray[j]=temp1;
        return String.valueOf(chararray);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permute(s,0);
        
    }
}