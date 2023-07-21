class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class reverse_linkedlist{
    public static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node curr=head,prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
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