package problem_set2;
import java.util.*;
class radix_sort_big_range{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long arr[] = new long[(int)n];
        long b[] = new long[(int)n];
        int count[] = new int[10];
        for(long i=0;i<n;i++) arr[(int) i]=sc.nextLong();
        int d=10;
        long base=1;
        while(d-->0){
            for(long i=0;i<n;i++)
              count[(int)((arr[(int) i]/base)%n)]++;
            for(int i=1;i<10;i++) count[i]=count[i]+count[i-1];
            for(long i=n-1;i>=0;i--){
                b[--count[(int) ((arr[(int) i]/base)%n)]]=arr[(int) i];
            }
            for(long i=0;i<n;i++) arr[(int) i]=b[(int) i];
            base=base*n;  
        }
        System.out.print(Arrays.toString(arr)); 
    }
}