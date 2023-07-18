import java.util.*;
import java.io.*;
class Node{
    String data;
    Node next;
    Node(String s){
        data=s;
        next=null;
    }
}
class MyStack{
    static Node head;
    static int sz;
    MyStack(){
        head=null;
        sz=0;
    }
    public static void push(String b){
        Node temp = new Node(b);
        temp.next=head;
        head=temp;
        sz++;
    }
    public static String pop(){
        if(head==null) return "-1";
        String res = head.data;
        head=head.next;
        sz--;
        return res;
    }
    public static String peek(){
        if(head==null) return "-1";
        return head.data;
    } 
    static boolean isEmpty(){
        return head==null;
    } 
    static int size(){
        return sz;
    }
}
class stackusinglinkedlist{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine(); 
        MyStack s = new MyStack();
        String arr[] = st.split(" ");
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        // s.push("abc");
        // s.push("def");
        // s.push("ghf");
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        // System.out.println(s.isEmpty());
        // System.out.println(s.size());
        String res="";
        while(!s.isEmpty()){
            res+=s.pop()+" ";
        }
        System.out.print("reversed string is "+res);
    }
}