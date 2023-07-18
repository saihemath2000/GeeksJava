import java.util.*;
class Stackusinglinkedlist{
    public static void main(String [] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        s.push(60);
        s.display();
    }
}
class Stack{
    class Node{
        int data;
        Node link;
    }
    Node top;
    Stack(){
        this.top=null;
    }
    public void push(int x){
        Node temp=new Node();
        if(temp==null) System.out.println("Overflow");
        else{
            temp.data=x;
            temp.link=top;
            top=temp;
        }
    }
    public int pop(){
        if(top==null) System.out.print("Undeflow");
        else{
            int x=top.data;
            top=top.link;
            return x;
        }
        return -1;
    }
    public void display(){
        if(top==null) System.out.println("stack is empty");
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
}