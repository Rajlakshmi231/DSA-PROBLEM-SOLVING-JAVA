// Search an element in a reverse sorted array
// Given an array arr[] sorted in decreasing order, and an integer X, the task is to check if X is present in the given array or not.
// If X is present in the array, print its index ( 0-based indexing). Otherwise, print -1.

// Input: arr[] = {5, 4, 3, 2, 1}, X = 4
// Output: 1    Explanation: Element X (= 4) is present at index 1.
// Input: arr[] = {10, 8, 2, -9}, X = 5
// Output: -1    Explanation: Element X (= 5) is not present in the array.

import java.util.*;
public class BinarySearchDS{
    public static int revBinarySearch(int arr[], int X){
        int start =0; int end = arr.length - 1;
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            // If the element is present at the mid itself
            if(arr[mid] == X){ 
                return mid;        
            }
            // If X is smaller than mid, Search in right half of subarray
            if(arr[mid] > X){     
                start = mid + 1;    
            }
            // Else search in left half of subarray
            else{
                end = mid - 1;    
            }
        }
        
        // If X not found
        return -1;
    }
    
    public static void main(String[] args){
        int arr[] = { 5, 4, 3, 2, 1};
        int X = 2;
        System.out.println(revBinarySearch(arr, X));
    } 
}

// Output :- 3
