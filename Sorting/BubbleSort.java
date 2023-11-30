// Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
//T.c :- O(N2) 		S.C :- O(N2)
import java.util.*;
public class Classroom{
    public static void bubbleSort(int arr[]){
	int n = arr.length;
	 //Loop to access each array element   
        for(int turn =0; turn < arr.length - 1; turn++){
	    //Loop to compare array element 
            for(int j =0; j < arr.length - turn - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Bubble Sort Optimized Approach
import java.util.*;
public class Classroom{
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        
        //Loop to access each array element
        for(int turn =0; turn < n - 1; turn++){
            boolean swapped = false;
            //Loop to compare array element
            for(int j =0; j < n - turn - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            //No Swapping means the array is already sorted so no need for further comparison
            if(!swapped)
            break;
        }
    }
    public static void main(String[] args){
        int arr[] = {-2, 9,5,4,1,3,2};
        bubbleSort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
	
	
	
