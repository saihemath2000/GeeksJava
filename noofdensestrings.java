import java.util.*;
class noofdensestrings{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int A[] = new int[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
            else count--;
            A[i]=count;
        }
        System.out.print(Arrays.toString(A));
        int n = s.length();
        int temp=CIP(A,0,n-1);
        System.out.print(temp);
        System.out.print((n*(n-1)/2)-temp);
    }
    private static int CIP(int A[], int l, int r){
        int count=0;
        if(l<r){
            int mid=(l+r)/2;
            count+=CIP(A,l,mid);
            count+=CIP(A,mid+1,r);
            count+=merge(A,l,mid,r);
        }
        return count;
    }
    private static int merge(int A[], int low,int mid, int high){
        // int mid =(low+high)/2;
        int left[] = Arrays.copyOfRange(A,low,mid+1);
        int right[] = Arrays.copyOfRange(A,mid+1,high+1);
        int i=0,j=0,k=low,swaps=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                A[k++]=left[i++];
            }else{
                swaps+=(mid+1)-(low+i);
                A[k++]=right[j++];
            }
        }
        while(i<left.length) A[k++]=left[i++];
        while(j<right.length) A[k++]=right[j++];
        return swaps;
    }
}