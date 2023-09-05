// Merge Sort Algorithm
// Problem:  Given an array of size n, sort the array using Merge Sort.

// 1.Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts. [(mid = s+(e-s)/2)]
// 2.There are 2 main functions :
// merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
// mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where,

// T.C: O(nlogn) 
// Reason: At each step, we divide the whole array, for that logn and we assume n steps are taken to get sorted array, so overall time complexity will be nlogn
// S.C: O(n) Reason: We are using a temporary array to store elements in sorted order.

public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l >= r){
            return;
        }
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr, mid + 1,r);
        merge(arr,l, mid, r);
    }
    public static void merge(int[] arr, int l,int mid, int r){
        int[] temp = new int[r-l+1];
        int i =l;
        int j = mid+1;
        int k =0;

        while(i<=mid && j <= r){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];

            }

        }
        while(i<= mid){
            temp[k++] = arr[i++];
        }
        while(j <= r){
            temp[k++] = arr[j++];
        }

        for( k =0, i = l; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
}
