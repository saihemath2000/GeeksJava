class Node{
    int data;
    Node left;
    Node right;
    Node(int k){
        data=k;
    }
}
class is_tree_balanced{
    public static int check(Node root){
        if(root==null) return 0;
        int lh= check(root.left);
        if(lh==-1) return -1;
        int rh = check(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        else return Math.max(lh,rh)+1;
    }
    public static void main(String [] args){
        Node root= new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right.right = new Node(6);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        System.out.print(check(root));
    }
}