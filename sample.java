public class sample {
    public static void main(String args[])
    {
        String str = "sai-hemanth";
        String[] arrOfStr = str.split("-", 0);
 
        for (String a : arrOfStr)
            System.out.print(a+" ");
    }
}