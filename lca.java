class Node{
    int key;
    Node left;
    Node right;
    Node(int d){key=d;}
}
class lca{
    public static Node lcas(Node root, Node n1, Node n2){
        if(root==null) return null;
        if(root==n1 || root==n2) return root;
        Node lca1 = lcas(root.left,n1,n2);
        Node lca2 = lcas(root.right,n1,n2);
        if(lca1!=null && lca2!=null) return root;
        if(lca1!=null) return lca1;
        else return lca2; 
    }
    public static void main(String [] args){
        Node root= new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        Node n1 = root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right.right = new Node(6);
        root.left.right.left = new Node(9);
        Node n2 =root.left.right.right = new Node(15);
        Node ans = lcas(root,n1,n2);
        if(ans!=null){
            System.out.print(ans.key);
        }
    }
}