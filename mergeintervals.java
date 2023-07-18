import java.util.*;
class Interval{
    int x,y;
    Interval(int i, int j){
        this.x=i;
        this.y=j;
    }
}
class Mysort implements Comparator<Interval>{
    public int compare(Interval a, Interval b){
          return a.x-b.x;
    }
}
class mergeintervals{
    public static void main(String [] args){
        Interval arr[]={new Interval(1,3), new Interval(2,4), new Interval(5,7),
                        new Interval(6,8)};
        Arrays.sort(arr, new Mysort());
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[res].y>=arr[i].x){
                arr[res].y = Math.max(arr[res].y,arr[i].y);
                arr[res].x = Math.min(arr[res].x,arr[i].x);
            }else{
                res++;
                arr[res]=arr[i];
            }
        }
        for(int i=0;i<=res;i++){
            System.out.println(arr[i].x+"-"+arr[i].y);
        }                
    }
}