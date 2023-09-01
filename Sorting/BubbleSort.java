// Given an Integer N and a list arr. Sort the array using bubble sort algorithm.

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        if(n ==0 || n==1){
            return;
        }
        for(int i =0; i<n-1; i++){
            if(arr[i] >arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);
        
    }
}
