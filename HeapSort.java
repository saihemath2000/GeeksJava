import java.util.*;
import java.io.*;
class HeapSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            MinHeap h = new MinHeap(a);
            for (int i=0;i<a;i++){
                int c = sc.nextInt();
                int n;
                if (c == 1) {
                    n = sc.nextInt();

                    h.insertKey(n);
                }
                if (c == 2) {
                    n = sc.nextInt();
                    h.deleteKey(n);
                }
                if (c == 3) {
                    System.out.print(h.extractMin() + " ");
                }
            }
            System.out.println();
        }
    }
}
class MinHeap{
   int harr[];
   int capacity;
   int heap_size;
   MinHeap(int cap){
    capacity=cap;
    heap_size=0;
    harr= new int[cap];
   }
   int parent(int i){return (i-1)/2;}
   int left(int i){return 2*i+1;}
   int right(int i){return 2*i+2;}
   int extractMin(){
    if(heap_size==0) return -1;
    if(heap_size==1){
        heap_size--;
        return harr[0];
    }
    else{
        int temp=harr[0];
        harr[0]=harr[heap_size-1];
        harr[heap_size-1]=temp;
        heap_size--;
        MinHeapify(0);
        return harr[heap_size];
    }
   }
   void insertKey(int k){
    if(heap_size==capacity) return;
    heap_size++;
    harr[heap_size-1]=k;
    for(int i=heap_size-1;i!=0 && harr[parent(i)]>harr[i];){
       int temp= harr[parent(i)];
       harr[parent(i)]=harr[i];
       harr[i]=temp;
       i=parent(i); 
    }
   }
   void deleteKey(int i) 
    {
        // Your code here.
        if(heap_size<=0||heap_size<=i) return;
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }
    void decreaseKey(int i, int new_val) 
    {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }
    void MinHeapify(int i){
        int l = left(i);
        int r= right(i);
        int smallest=i;
        if(l<heap_size && harr[l]<harr[i]) smallest=l;
        if(r<heap_size && harr[r]<harr[smallest]) smallest=r;
        if(smallest!=i){
            int temp= harr[i];
            harr[i]=harr[smallest];
            harr[smallest]=temp;
            MinHeapify(smallest);
        }
    }
}
