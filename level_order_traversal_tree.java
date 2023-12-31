import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    Node(int d){key=d;}
}
class level_order_traversal_tree{
    public static void main(String [] args){
        Node root= new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right.right = new Node(6);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
}