// LinkedHashMap Implementation

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        //create LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        
        //Insert -- O(1)
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        System.out.println(lhm);
    }
}

// Output :- {India=100, China=150, US=50}  Unlike HashMap In LinkedHashMap the elements are stored in the order of their insertion.
