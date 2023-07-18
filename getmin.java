import java.util.*;
class MyStack{
    Stack<Integer> s;
    Integer minele;
    MyStack(){
      s = new Stack<Integer>();
    }
    public void getminele(){
        if(s.isEmpty()) System.out.println("stack is empty");
        else{
            System.out.println(minele);
        }
    }
    public void pop(){
        if(s.isEmpty()) System.out.print("empty");
        Integer t= s.pop();
        if(t<minele){
            minele=2*minele-t;
        }
    }
    public void push(Integer x){
        if(s.isEmpty()){
            minele=x;
            s.push(x);
        }
        if(x<minele){
           minele=x;
           s.push(2*x-minele);
        } else s.push(x);
    }
}
class getmin{
    public static void main(String [] args){
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(4);
        s.push(2);
        s.getminele();
        s.push(7);
        s.push(6);
        s.pop();
        s.getminele();
        s.push(9);
    }
}