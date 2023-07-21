import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class recursive_reverse_linkedlist{
    public static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node newhead = reverse(head.next); //to store new head
        Node headnext = head.next;
        headnext.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String [] args){
        Node head= new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        head.next.next.next = new Node(40);
        Node ans =reverse(head);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}