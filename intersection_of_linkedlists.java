//change the input format again
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class intersection_of_linkedlists{
    public static void main(String [] args){
        int count1=0,count2=0;
        Node head1 = new Node(5);
        head1.next = new Node(8);
        head1.next.next= new Node(7);
        head1.next.next.next= new Node(10);
        head1.next.next.next.next= new Node(12);
        head1.next.next.next.next.next= new Node(15);
        head1.next.next.next.next.next.next= null;
        Node temp1=head1;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        } 
        Node head2 = new Node(9);
        head2.next = new Node(10);
        head2.next.next= new Node(12);
        head2.next.next.next= new Node(15);
        head2.next.next.next.next= null;
        Node temp2=head2;
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        int diff=count1-count2;
        while(diff-->0){
            if(count1>count2)
               head1=head1.next;
            else head2=head2.next;   
        }
        // System.out.print(head2.data);       
        while(head1!=null && head2!=null){
            if(head1==head2){
                System.out.print(head1.data);
                break;
            }
            head1=head1.next;
            head2=head2.next;
        }
    }
}