import java.util.Scanner;

public class matrix_expo_code3{
    static final int MOD = 100000;

    static int[][] matrixMultiplyMod(int[][] A, int[][] B, int m) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] = (int) ((result[i][j] + 1L * A[i][k] * B[k][j]) % m);
                }
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

    static int modifiedFibonacciModuloLargeN(long n, int m) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return (int) n;
        }
        
        int[][] transformationMatrix = {
            {2, 0, -3},
            {1, 0, 0},
            {0, 1, 0}
        };
        
        int[][] poweredMatrix = matrixPowerMod(transformationMatrix, n - 2, m);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(poweredMatrix[i][j]+" ");
            }
            System.out.println();
        }
        int[] initialVector = {2, 1, 0};
        int[] resultVector = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultVector[i] = (int) ((resultVector[i] + 1L * poweredMatrix[i][j] * initialVector[j]))%m;
            }
        }
        
        int result = resultVector[0];
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = scanner.nextLong();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        int result = modifiedFibonacciModuloLargeN(n, m);
        System.out.println("F(" + n + ") % " + m + " = " + result);
    }
}
