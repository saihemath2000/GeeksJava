import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d, Node n){
        data=d;
        next=n;
    }
}
class reverse_linkedlist_group_k{
    public static Node rgroupk(Node head, int k){
        int temp=k;
        Node curr=head,nextnode=null,prev=null;
        while(curr!=null && temp<k){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
            temp++;
        }
        if(nextnode!=null){
            Node rest_head = rgroupk(nextnode,k);
            head.next=rest_head;
        }
        return prev;
    }
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      Node head=null;
      for(int i=n-1;i>=0;i--){
           head = new Node(arr[i],head);
      }
      int k= sc.nextInt();
      Node ans=rgroupk(head,k);
      while(ans!=null){
        System.out.print(ans.data);
        ans=ans.next;
      }
    }
}