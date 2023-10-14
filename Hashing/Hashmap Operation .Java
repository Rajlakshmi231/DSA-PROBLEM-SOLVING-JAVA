// HashMap operation

import java.util.*;

public class Classroom{
    public static void main(String args[]){
        //create Hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Insert -- O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);  //Output:- {China=150, US=50, India=100} HashMap is unordered map , so it not necessesary that the data which goes first will come first in o/p

        //size
        System.out.println(hm.size());                      //Output:- 3
        
        //is Empty
        System.out.println(hm.isEmpty());                   //Output:- false
        
        //get -- O(1)
        int population = hm.get("India");
        System.out.println(population);                     //Output:- 100
        
        System.out.println(hm.get("Indonesia"));            //Output:- null
        
        // containsKey -- O(1)
        System.out.println(hm.containsKey("India"));        //Output:- true
        System.out.println(hm.containsKey("Indonesia"));    //Output:- false
        
        // remove -- O(1)
        System.out.println(hm.remove("China"));             //Output:- 150
        System.out.println(hm);                             //Output:- {US=50, India=100}
        
        //Clear
        hm.clear();
        System.out.println(hm.isEmpty());                   //Output:- true
    
    }
}
