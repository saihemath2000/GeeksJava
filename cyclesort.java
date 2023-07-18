import java.util.*;
class cyclesort{
    public static void sort(int arr[]){
        for(int cs=0;cs<arr.length-1;cs++){
          int pos=cs,item=arr[cs];
          for(int i=cs+1;i<arr.length;i++){
            if(arr[i]<arr[cs]) pos++;
          }
          item^=arr[pos];
          arr[pos]^=item;
          item^=arr[pos];
          while(pos!=cs){
            pos=cs;
            for(int i=cs+1;i<arr.length;i++){
                if(arr[i]<item) pos++;
            }
            item^=arr[pos];
            arr[pos]^=item;
            item^=arr[pos];
          }   
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}