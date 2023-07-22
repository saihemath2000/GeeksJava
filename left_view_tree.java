class Node{
    int key;
    Node left;
    Node right;
    Node(int d){key=d;}
}
class left_view_tree{
    static int maxlevel=0;
    public static void leftview(Node root, int level){
        if(root==null) return;
        if(maxlevel<level){
            System.out.print(root.key+" ");
            maxlevel=level;
        }
        leftview(root.left,level+1);
        leftview(root.right,level+1);
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
        leftview(root,1);
    }
}