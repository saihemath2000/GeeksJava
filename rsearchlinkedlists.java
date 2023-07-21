import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class rsearchlinkedlists{
    public static int recursive(Node head, int x){
        if(head==null) return -1;
        if(head.data==x) return 1;
        else{
            int res = recursive(head.next,x);
            if(res==-1) return -1;
            else return (res+1);
        } 
    }
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int x = sc.nextInt();
        Node head = new Node(10);
        head.next= new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(30);
        System.out.print(recursive(head,x));
    }
}