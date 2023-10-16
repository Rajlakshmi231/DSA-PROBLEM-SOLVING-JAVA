// Iteration on HashSet

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        //create HashSet
        HashSet<String> cities = new HashSet<>();
        
        //Insert -- O(1)
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        
        
        //iterating on set using set inbuilt iterator (T.C :- O(N))
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        // iterating using enhanced for loop
        // for(String city : cities){
        //     System.out.println(city);
        // }
    }
}

// Output :-
          // Delhi
          // Bengaluru
          // Noida
          // Mumbai
