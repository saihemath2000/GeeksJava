package problem_set2;
import java.util.*;
public class problem_9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int k = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];
        for(int i=0;i<n;i++) A[i]=sc.nextInt();
        for(int i=0;i<m;i++) B[i]=sc.nextInt();
        System.out.print(Rank(A,n,B,m,k));
    }
    public static int Rank(int A[],int n,int B[],int m,int k){
        if(n==0){
            return B[m-k];    
        }
        if(m==0) return A[n-k];
        if(k==1){
            if(A[n-1]>B[m-1]) return A[n-1];
            else return B[m-1];
        }else{
            int i=n-k/2,j=m-k/2;
            if(i<0)  i=0;
            if(j<0) j=0;
            if(A[i]>B[j])
               return Rank(A,i,B,m,k-(n-i));
            else 
               return Rank(A,n,B,j,k-(m-j));   
        }
    }
}
