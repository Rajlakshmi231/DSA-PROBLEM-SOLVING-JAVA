// HashSet Implementation

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        //create HashSet
        HashSet<Integer> set = new HashSet<>();
        
        //Insert -- O(1)
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        
        System.out.println(set);                                       //Output:- [1, 2, 4]
        
        //size
        System.out.println(set.size());                                //Output:- 3
    
        //remove -- O(1)
        set.remove(2);
        
        // containsKey -- O(1)
        if(set.contains(2)){
            System.out.println("set contains key"); 
        }
        else{
            System.out.println("set does not contains the key");      //Output:- set does not contains the key
        }
        
        //is Empty 
        System.out.println(set.isEmpty());                           //Output:- false
    }
}
