// Insertion Sort
// T.C :-	 Best	O(n)  Worst	O(n2)  Average	O(n2)
// S.C :-	O(1)

import java.util.*;
public class Classroom{
    
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // Compare key with each element on the left of it until an element smaller than it is found.
            // For descending order, change key<array[j] to key>array[j].
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion (Place key at after the element just smaller than it.)
            arr[prev+1]  = curr;
        }
    } 
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arr)); 
    }
}

// Output :- 
// Sorted Array in Ascending Order: 
// [1, 2, 3, 4, 5]
