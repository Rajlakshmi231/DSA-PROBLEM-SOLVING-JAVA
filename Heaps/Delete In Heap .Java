// Delete In Heap
// Steps :- 
          // 1. Select the element to be deleted.
          // 2. Swap it with the last element.
          // 3. Remove the last element.
          // 4. Fix the heap (Heapify the tree).
// Suppose the Heap is a Max-Heap as:
//       10
//     /    \
//    5      3
//   / \
//  2   4

// The element to be deleted is root, i.e. 10.

// Process:
// The last element is 4.

// Step 1: Swap the last element with root, and delete it.
//       4
//     /    \
//    5      3
//   / 
//  2   

// Step 2: Heapify root.
// Final Heap:
//       5
//     /    \
//    4      3
//   / 
//  2   

import java.util.*;
public class deletionHeap {

    static class Heap{
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

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
        int minIdx = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2
 
        // If left child is smaller than root
        if (left < arr.size() && arr.get(minIdx) > arr.get(left)){
          minIdx = left;
        }
      
        // If right child is smaller than minIdx 
        if (right < arr.size() && arr.get(minIdx) > arr.get(right)){
          minIdx = left;
        }
      
        // If largest is not root
        if (minIdx != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);
           
            // Recursively heapify the affected sub-tree
            heapify(minIdx);
        }
    
         // Function to delete the root from Heap
        public int remove(){
      
            int data = arr.get(0);
    
            // Step1 :- Swap 1st and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set((arr.size() - 1), temp);
          
            // Step2 :- delete last
            arr.remove(arr.size() - 1);
        
            // Step3 :- heapify 
            heapify(0);
            return data;
        }
        
        public boolean isEmpty(){
            return arr.size() == 0;
        }
        
    }
    
    public static void main(String args[]) {
        Heap h = new Heap();
        h.add( 3);
        h.add( 4);
        h.add( 1);
        h.add( 5);
        while(!h.isEmpty()){
           System.out.println(h.peek());
           h.remove();
        }
    }
}
 


    
