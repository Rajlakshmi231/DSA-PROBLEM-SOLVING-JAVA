// TreeMap Implementation

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        //create TreeHashMap
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        //Insert -- O(1)
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 50);
        System.out.println(tm);
    }
}

// Output :- {China=150, India=100, Indonesia=5, US=50}   TreeMap guarantees that the keys will always be sorted according to the specified order.
