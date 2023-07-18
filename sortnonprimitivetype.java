import java.util.*;
class Point{
    int x,y;
    Point(int a,int b){
        x=a;
        y=b;
    }
}
class MyCmp implements Comparator<Point>{
    public int compare(Point p1,Point p2){
        return p1.x-p2.x;
    }
}
class sortnonprimitivetype{
      public static void main(String [] args){
      Point arr[]= {new Point(70,90),new Point(30,40),new Point(50,60)};
      Arrays.sort(arr,new MyCmp());
      for(int i=0;i<arr.length;i++)
         System.out.println(arr[i].x+" "+arr[i].y);
      }
}