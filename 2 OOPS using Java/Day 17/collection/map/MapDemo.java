package collection.map;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<Integer,String> mp=new HashMap<>();
//        Map<Integer,String> mp=new LinkedHashMap<>();
        Map<Integer,String> mp=new TreeMap<>();
        mp.put(105, "Ramesh");
        mp.put(102, "Suresh");
        mp.put(103, "Mahesh");
        mp.put(104, "Dinesh");
        mp.put(101, "Bhavesh");
        
//        System.out.println(mp);
        for(Integer i:mp.keySet()){
            String val=mp.get(i);
            System.out.println("Key : "+i+", Value : "+val+"ji");
        }
        for(String i:mp.values()){
            System.out.println(i);
        }
            
    }
}
