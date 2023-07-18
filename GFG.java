import java.util.*;
public class GFG {

	// Function to merge two partitions
	// such that the merged array is sorted
	static void merge(int[] v, int left, int mid, int right,
					int inversions)
	{
		int[] temp = new int[(right - left + 1)];

		int i = left;
		int j = mid + 1;
		int k = 0;

		while ((i <= mid) && (j <= right)) {
			if (v[i] <= v[j]) {
				temp[k++] = v[i++];
			}
			else {
				// Counting inversions
				inversions += (mid - i + 1);

				temp[k++] = v[j++];
			}
		}

		while (i <= mid)
			temp[k++] = v[i++];

		while (j <= right)
			temp[k++] = v[j++];

		k = 0;
		for (int a = left; a <= right; a++) {
			v[a] = temp[k++];
		}
	}

	// Function to implement merge sort
	static void mergeSort(int[] v, int left, int right,
						int inversions)
	{
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(v, left, mid, inversions);
			mergeSort(v, mid + 1, right, inversions);
			merge(v, left, mid, right, inversions);
		}
	}

	// Function to calculate number of
	// inversions in a given array
	static int CountInversions(int[] v)
	{
		int n = v.length;
		int inversions = 0;

		// Calculate the number of inversions
		mergeSort(v, 0, n - 1, inversions);

		// Return the number of inversions
		return inversions;
	}

	// Function to count the number of
	// substrings that contains more 1s than 0s
	static int getSubsCount(String input){
		int n = input.length();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = input.charAt(i) - '0';
			if (nums[i] == 0)
				nums[i] = -1;
		}
		// Stores the prefix sum array
		int[] pref = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			pref[i] = sum;
		}
        System.out.print(Arrays.toString(pref));
		int cnt = 1;
		// Stores the count of valid substrings
		for (int i = 0; i < n; i++) {
			if (pref[i] > 0)
				cnt++;
		}
		Arrays.sort(pref);
		Collections.reverse(Arrays.asList(pref));

		int inversions = CountInversions(pref);

		int ans = cnt + inversions;

		return ans;
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Given Input
		String input = "101";

		// Function Call
		int ans = getSubsCount(input);

		System.out.println(ans);
	}
}

// This code is contributed by phasing17.
