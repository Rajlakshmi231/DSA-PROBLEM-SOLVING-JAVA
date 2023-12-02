// Selection Sort
// T.C :- Best	O(n2)  Worst	O(n2)  Average	O(n2)
// S.C :-	O(1)

import java.util.*;
public class Classroom{
    public static void selectionSort(int[] arr){
        int n = arr.length;
        
        for(int i =0; i<n-1; i++){
            int minPos = i;
            for(int j = i+1; j<=n-1; j++){
                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }  
            }
            // put minPos at the correct position
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
        
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arr)); 
    }
}
