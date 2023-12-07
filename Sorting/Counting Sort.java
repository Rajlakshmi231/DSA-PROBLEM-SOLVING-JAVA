// Counting Sort Algorithm
// T.C :-	 Best	O(n+k)    Worst	O(n+k)    Average	O(n+k)
// S.C :-	O(max)

import java.util.*;
public class Classroom{
    public static void countingSort(int arr[]){
        //Find the largest element of the array
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        // Store the count of each element
        int count[] = new int[largest + 1];
        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //Sorting
        int j =0;
        for(int i =0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arr));
    }
}

// Output :-
// Sorted Array in Ascending Order: 
// [1, 1, 2, 3, 3, 4, 4, 7]
