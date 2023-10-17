// TreeSet Implementation 

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        
        //HashSet
        HashSet<String> set = new HashSet<>();
        //Insert -- O(1)
        set.add("India");
        set.add("China");
        set.add("Indonesia");
        set.add("USA");
        
        System.out.println(set);     //Output :- [USA, China, India, Indonesia]  Gives output in random order                                 
        
        //LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //Insert -- O(1)
        lhs.add("India");
        lhs.add("China");
        lhs.add("Indonesia");
        lhs.add("USA");
        
        System.out.println(lhs);    //Output :- [India, China, Indonesia, USA]  Gives output as the input is given  
        
        //TreeSet
        TreeSet<String> ts = new TreeSet<>();
        //Insert -- O(logn)
        ts.add("India");
        ts.add("China");
        ts.add("Indonesia");
        ts.add("USA");
        
        System.out.println(ts);     //Output :- [China, India, Indonesia, USA]  Gives output in ascending order 
    }
}
