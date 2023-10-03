// Pairs In An Array

import java.util.*;
public class ArrayDs{
    public static void printPairs(int arr[]){
        int tp = 0;  //Calculating total pair
        for(int i =0; i < arr.length; i++){
            for(int j =i+1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")"); //printing pairs
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp); //printing total number of pairs
    }
    
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        printPairs(arr);
    }
}

// Output :- 
        // (2,4)(2,6)(2,8)(2,10)
        // (4,6)(4,8)(4,10)
        // (6,8)(6,10)
        // (8,10)
        
        // Total Pair : 10
