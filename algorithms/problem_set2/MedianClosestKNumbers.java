package problem_set2;
import java.util.*;

public class MedianClosestKNumbers {
    public static void main(String[] args) {
        int[] arr = {5,10,11,3,8};
        int k = 2;
        int[] closestNumbers = findClosestKNumbers(arr, k);
        System.out.println("Closest " + k + " numbers to the median:");
        System.out.println(Arrays.toString(closestNumbers));
    }
    
    public static int[] findClosestKNumbers(int[] arr, int k) {
        int medianIndex = arr.length / 2;
        int median = quickSelect(arr, 0, arr.length - 1, medianIndex);
        int left = median-1;
        int right = median+1;
        int[] closestNumbers = new int[k];
        while(left>=0 && right<arr.length){
            int leftdiff = Math.abs(arr[left]-arr[median]);
            int rightdiff =Math.abs(arr[right]-arr[median]);
        }
        return closestNumbers;
    }
    
    public static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }
        
        int pivotIndex = partition(arr, left, right);
        
        if (k == pivotIndex) {
            return k;
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }
    
    private static int partition(int arr[],int p,int q){
        Random rand = new Random();
        int index = rand.nextInt(q-p+1)+p;
        // System.out.print(index+" ");
        int temp=arr[p];
        arr[p]=arr[index];
        arr[index]=temp;
        int pivot=arr[p];
        int i=p+1,j=q;
        while(i<=j){
            while(i<=j && arr[i]<=pivot)i++;
            while(i<=j && arr[j]>pivot) j--;
            if(i<=j){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j--;
            }
        }
        i--;
        int temp1=arr[p];
        arr[p]=arr[i];
        arr[i]=temp1;
        return i;
    }
}
