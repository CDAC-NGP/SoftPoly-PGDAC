package collection.set;

import java.util.*;

public class DemoHashSet2 {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(10,10,20,30,30,40,40,50);
        Set<Integer> st=new HashSet<>();
        st.addAll(lst);
        System.out.println(lst);
        System.out.println(st);
        lst=new ArrayList<>();
        lst.addAll(st);
        
        System.out.println(lst);
    }
}
