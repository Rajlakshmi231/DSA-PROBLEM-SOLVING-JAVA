// Insert In Heap
//T.C :- O(logN)

import java.util.*;
public class Classroom {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data){ 
            //add at last idx
            arr.add(data);
            
            int x = arr.size() - 1; //x iss child index
            int par = (x - 1)/2; //par index
            
            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                x = par;
                par = (x - 1)/2;   
            } 
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
    }
}
