import java.util.Scanner;

public class matrix_expo_code1 {
    static int[][] matrixMultiplyMod(int[][] A, int[][] B, int m) {
        int[][] result = new int[2][2];
        for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                   result[i][j]=0;
                 for(int k=0;k<2;k++) result[i][j]=(result[i][j]+A[i][k]*B[k][j])%m;
             }
         }
        return result;
    }

    static int[][] matrixPowerMod(int[][] M, long exponent, int m) {
        if (exponent == 1) {
            return M;
        }
        if (exponent % 2 == 0) {
            int[][] halfPower = matrixPowerMod(M, exponent / 2, m);
            return matrixMultiplyMod(halfPower, halfPower, m);
        } else {
            int[][] halfPower = matrixPowerMod(M, (exponent - 1) / 2, m);
            return matrixMultiplyMod(matrixMultiplyMod(halfPower, halfPower, m), M, m);
        }
    }

    static int fibonacciModuloLargeN(long n, int m) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[][] M = {{1, 1}, {1, 0}};
        int[][] P = matrixPowerMod(M, n - 1, m);
        // System.out.print(P);
        return P[0][0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = scanner.nextLong();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        int result = fibonacciModuloLargeN(n, m);
        System.out.println("F(" + n + ") % " + m + " = " + result);
    }
}
