import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class Idgenerator{
    private HashMap<Integer,Integer> idcounters;
    public Idgenerator(){
        this.idcounters = new HashMap<>();
    }
    public String getnextId(){
        int year=getYear();
        
    }
    public static void main(String [] args){
        Idgenerator i = new Idgenerator();
        for(int i=0;i<10;i++){
            String nextId = i.getnextId();
            System.out.print(nextId);
        }
    }
}
