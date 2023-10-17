// LinkedHashSet Implementation

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        //create LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        //Insert -- O(1)
        lhs.add("India");
        lhs.add("China");
        lhs.add("Indonesia");
        lhs.add("USA");
        
        System.out.println(lhs);
        
        lhs.remove("China");
        System.out.println(lhs);
    }
}

// Output :- 
          // [India, China, Indonesia, USA]
          // [India, Indonesia, USA]
