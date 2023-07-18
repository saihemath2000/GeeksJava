import java.util.*;
import java.io.*;
import java.lang.*;
class Urldesign {
    public static void main(String [] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-->0){
            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr=0;
            for(int i=0; (i<queries) && (itr<len);i++){
                String queryType = str[itr++];
                if(queryType.equals("SET")){
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key,value);
                }
                if(queryType.equals("GET")){
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key)+" ");
                }
            }
            System.out.println();
        }
    }
}

class LRUCache{
    static class Node{
        int key,value;
        Node next,prev;
        public Node(int key, int value){
            this.key=key;
            this.value=value;
            next=prev=null;
        }
    }
    static HashMap<Integer,Node> hm;
    static int capacity,count;
    static Node head,tail;
    LRUCache(int cap){
        hm = new HashMap<>();
        this.capacity=cap;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public static int get(int key){
       if(hm.containsKey(key)){
         Node newnode = hm.get(key);
         delete(newnode);
         insert(newnode);
         return newnode.value;
       }else{
        return -1;
       }
    }
    public static void set(int key,int value){
        if(hm.containsKey(key)){
            Node newnode = hm.get(key);
            newnode.value=value;
            hm.put(key,newnode);
            delete(newnode);
            insert(newnode);
        }else if(hm.size()<capacity){
            Node newnode = new Node(key,value);
            hm.put(key,newnode);
            insert(newnode);
        }else{
            Node newnode = new Node(key,value);
            Node toDelete = tail.prev;
            hm.remove(toDelete.key);
            delete(toDelete);
            hm.put(key,newnode);
            insert(newnode);
        }
    }
    public static void insert(Node node){
        Node headnext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headnext;
        headnext.prev=node;
    }
    public static void delete(Node node){
        Node prev=node.prev;
        Node next= node.next;
        prev.next=next;
        next.prev=prev; 
    }
}