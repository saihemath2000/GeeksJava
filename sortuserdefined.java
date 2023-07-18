import java.util.*;
class Point{
    int x,y;
    Point(int i, int j){
        x=i;
        y=j;
    }
}
class Mysort implements Comparator<Point>{
    public int compare(Point a, Point b){
        return a.x-b.x;
    }
}
class sortuserdefined{
    public static void main(String[] args){
        Point arr[] ={new Point(5,10), new Point(3,15), new Point(1,20)};
        Arrays.sort(arr, new Mysort());
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].x+" "+arr[i].y);
        }
    }
}