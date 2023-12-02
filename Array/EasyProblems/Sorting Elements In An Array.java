// Sorting Elements In An Array
//T.C :- O(N^2)

public class Main { 
    public static void main(String[] args) { 

       //Initialize array 
       int [] arr = new int [] {10, 40, 30, 20};  

       //Sort the array in ascending order 
       for (int i = 0; i < arr.length; i++) { 
           for (int j = i+1; j < arr.length; j++) { if(arr[i] > arr[j]) { 
                 int temp = arr[i]; 
                 arr[i] = arr[j]; 
                 arr[j] = temp; 
              } 
           } 
       } 

    //Displaying elements of array after sorting 
    for (int i = 0; i < arr.length; i++) { 
     System.out.print(arr[i] + " "); 
   } 
  } 
}