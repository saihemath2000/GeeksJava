class LinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int k){
            data=k;
            next=null;
        }
    }
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.head= new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        ll.head.next=second;
        second.next=third;
        Node n =head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
}