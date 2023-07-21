import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class insertatbegin_circular{
    public static Node insertatbegin(Node head, int value){
        Node temp = new Node(value);
        if(head==null){
           temp.next=temp;
           return temp;
        }
        else{ 
        temp.next=head.next;
        head.next=temp;
        int t=temp.data;
        temp.data=head.data;
        head.data=t;
        return head;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Node head= new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next=head;
        Node ans=insertatbegin(head,value);

        while(ans.next!=head){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
        System.out.print(ans.data);
    }
}