//program1

// public class Main {
// public static void main (String[] args) {
// int N = 2147483647;
// int M = 100000;
// for(int i =0; i< N; i++) {
// int[] box = new int[M];
// }
// }
// }
//result:Took so long

//program2
public class Test1 {
public static void main (String [] args){
int N = 2147483647;
int M = 100000;
int[][] boxes = new int[N][];
for(int i =0; i< N; i++) {
  int[] box = new int[M];
  boxes[i] = box;
}
}
}

//result: Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//The max value of n that you can use without running into memory issues depends on various factors,
//including available memory on our machine and mem req of program.
//To configure java to allow larger amounts of memory(heap), you can use the '-Xmx' flag when running program
// java -Xmx2g program --> 2Gigabytes
// remember to consult yours machine specifications and ensure you have sufficient mem available before allocating large amounts of memory


