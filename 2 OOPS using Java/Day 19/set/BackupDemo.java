package collection.set;

import java.util.*;

public class BackupDemo {
    public static void main(String[] args) {
        List<Integer> originallst=new ArrayList<>();
        originallst.add(100);
        originallst.add(200);
        originallst.add(300);
        
        List<Integer> backuplst=originallst.subList(0,3);
        System.out.println(originallst);
        System.out.println(backuplst);
        
//        originallst.add(500);
        backuplst.add(500);
//        backuplst.add(700);
//        backuplst.remove(1);
//        originallst.add(700);
        
        System.out.println(originallst);
        System.out.println(backuplst);
    }
}
