// Recrsive Approach Of Binary Search

import java.util.*;
public class BinarySearch{
    public static int binarySearch(int arr[], int start , int end, int key){
       
        if(start <= end){
            int mid = start + (end - start)/2;
            
            // If the element is present at the mid itself
            if(arr[mid] == key){
                return mid;
            }
            
            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > key) {
                return binarySearch(arr, start, mid-1, key);
            }
            
            // Else the element can only be present in right subarray
                return binarySearch(arr, mid+1, end, key);
        }
        // We reach here when element is not present in array
        return -1;   
    }
    
    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        int key = 7;
        int s =0, e = arr.length - 1;
        
        int result = bs.binarySearch(arr, 0, arr.length - 1, key);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println(
                "Element is present at index " + result);
    }
}

// Output :- Element is present at index 4
