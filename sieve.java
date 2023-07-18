import java.util.*;
class sieve{
    public static void main(String [] args){
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            number= sc.nextInt();
        }
        boolean array[] = new boolean[number+1];
        for(int i=0;i<=number;i++){
            array[i]=true;
        }
        for(int i=2;i*i<=number;i++){
            if(array[i]==true){
                for(int j=i*i;j<=number;j=j+i){
                    array[j]=false;
                }
            }
        }
        for(int i=2;i<=number;i++){
            if(array[i]==true){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}