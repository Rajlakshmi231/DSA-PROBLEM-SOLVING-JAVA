// Union And Intersection Of Two Arrays 

import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int nums1[] = {7, 3, 9 };
        int nums2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();
        
        //Union                  T.c :- O(N + M)
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        
        System.out.println("Union = " + set.size());
        
        
        //Intersection          T.c :- O(N + M)
        set.clear();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        int cnt = 0;
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                cnt++;
                set.remove(nums2[i]);
            }
        }
        System.out.println("Intersection = " + cnt);  
    }
}

//Output :- 
          // Union = 6
          // Intersection = 2
