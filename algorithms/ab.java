import java.util.*;

public class ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int A[] = new int[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;
            A[i] = count;
        }
        int n = s.length();
        int temp = CIP(A, 0, n - 1);
        int result = (n * (n - 1)) / 2 - temp;

        // Exclude cases where 1s are equal to 0s
        int equalOnesAndZeros = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0 && s.charAt(i) == '0') {
                equalOnesAndZeros++;
            }
        }
        result -= equalOnesAndZeros;

        System.out.print(result);
    }

    private static int CIP(int A[], int l, int r) {
        int count = 0;
        if (l < r) {
            int mid = (l + r) / 2;
            count += CIP(A, l, mid);
            count += CIP(A, mid + 1, r);
            count += merge(A, l, mid, r);
        }
        return count;
    }

    private static int merge(int A[], int low, int mid, int high) {
        int left[] = Arrays.copyOfRange(A, low, mid + 1);
        int right[] = Arrays.copyOfRange(A, mid + 1, high + 1);
        int i = 0, j = 0, k = low, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                A[k++] = left[i++];
                swaps++;
            } else {
                // swaps += mid + 1 - (i + low);
                A[k++] = right[j++];
            }
        }

        while (i < left.length) A[k++] = left[i++];
        while (j < right.length) A[k++] = right[j++];

        return swaps;
    }
}
