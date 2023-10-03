// Iterative Approach Of Binary Search
//T.C :- O(logN)      S.C :- O(1)

import java.util.*;
public class BinarySearchDS{
    public static int binarySearch(int arr[], int key){
        int start =0; int end = arr.length - 1;
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] == key){ 
                return mid;         //mid is key  
            }
            if(arr[mid] < key){     
                start = mid + 1;    //left
            }
            else{
                end = mid - 1;    // right
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        int key = 4;
        System.out.println(binarySearch(arr, key));
    } 
}
