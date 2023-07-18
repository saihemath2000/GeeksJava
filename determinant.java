import java.util.*;
class determinant{
    public static void cofactor(int matrix[][], int temp[][], int p,int q, int n){
        int i=0,j=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row!=p && col!=q){
                    temp[i][j++]=matrix[row][col];
                    if(j==n-1){
                        i++;
                        j=0;
                    }
                }
            }
        }        

    }
    public static int detOfMatrix(int matrix[][], int n){
        int res=0;
        if(n==1)
           return matrix[0][0];
        int temp[][] = new int[n][n];
        int sign=1;   
        for(int i=0;i<n;i++){
            cofactor(matrix,temp,0,i,n);
            res+=sign * matrix[0][i] * detOfMatrix(temp,n-1);
            // System.out.println(res);
            sign=-1*sign;
        }
        return res;
    }
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.print(detOfMatrix(matrix,n));
    }
}