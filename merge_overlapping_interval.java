import java.util.*;
class Interval implements Comparable<Interval>{
    int start,end;
    Interval(int s, int e){
        this.start=s;
        this.end=e;
    }
    public int compareTo(Interval i){
        return this.start-i.start;
    }
}
class merge_overlapping_interval{
    public static void merge(Interval arr[]){
        int res=0;
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++)
        //    System.out.print(arr[i].start+"--"+arr[i].end);
        for(int i=1;i<arr.length;i++){
            if(arr[i].start<=arr[res].end){
                arr[res].end= Math.max(arr[res].end,arr[i].end);
                arr[res].start=Math.min(arr[res].start,arr[i].start);
            }else{
                res++;
                arr[res]=arr[i];
            }
        }
        int uniquele=0;
        for(int i=0;i<=res;i++){
          uniquele+=(arr[i].end-arr[i].start+1);  
          System.out.println(arr[i].start+"-"+arr[i].end);
        }
        System.out.print("no of unique elements are "+uniquele);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Interval arr[] = new Interval[n];
        for(int i=0;i<n;i++)
           arr[i]= new Interval(sc.nextInt(),sc.nextInt());
        merge(arr);   
    }
}