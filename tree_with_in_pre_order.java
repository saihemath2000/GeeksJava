import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){data=d;}
}
class tree_with_in_pre_order{
    static int preindex=0;
    public static Node inpre(int in[],int pre[], int is, int ie){
        if(is>ie) return null;
         int inindex=0;
         Node root = new Node(pre[preindex++]);
         for(int i=is;i<=in.length;i++){
            if(in[i]==root.data){
                inindex=i;
                break;
            }
         }
         root.left = inpre(in,pre,is,inindex-1);
         root.right = inpre(in,pre,inindex+1,ie);
         return root;
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
        int in[] ={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        Node ans = inpre(in,pre,0,in.length-1);
        // System.out.print(ans.data);
        Queue<Node> q = new ArrayDeque<>();
        q.add(ans);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
}