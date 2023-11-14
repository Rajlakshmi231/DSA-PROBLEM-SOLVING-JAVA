//Brute Force Approach  T.C: O(NlogN), S.C: O(1)

import java.io.*;
import java.util.Arrays;
class Test
{
static private void getElements(int[] arr, int n)
{
	if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	Arrays.sort(arr);
	int small = arr[1];
	int large = arr[n - 2];
	System.out.println("Second smallest is "+small);
	System.out.println("Second largest is "+large);
}
public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5};
	int n = arr.length;
	getElements(arr, n);
}
}

/* Output:-
Second smallest is 2
Second largest is 6 */


// Better Approach  T.C: O(N), S.C: O(1)

import java.io.*;
import java.util.Arrays;
class Test{
static private void getElements(int[] arr, int n){
if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0;i < n;i++)
	{
		small = Math.min(small,arr[i]);
		large = Math.max(large,arr[i]);
	}
	for (i = 0;i < n;i++)
	{
		if (arr[i] < second_small && arr[i] != small)
		{
			second_small = arr[i];
		}
		if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}

	System.out.println("Second smallest is "+second_small);
	System.out.println("Second largest is "+second_large);
}
public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5};
	int n = arr.length;
	getElements(arr, n);
}
}



// Optimal Approach  T.C: O(N), S.C: O(1)

import java.io.*;
class Test{
static private int secondSmallest(int[] arr, int n)
{
	if (n < 2) return -1;
	
	int smallest = Integer.MAX_VALUE;
	int second_Smallest = Integer.MAX_VALUE;
	
	for (int i = 0; i < n; i++){
	   if (arr[i] < smallest){
		  second_Smallest = smallest;
		  smallest = arr[i];
	   }
	   else if (arr[i] < second_Smallest && arr[i] != smallest){
		  second_Smallest = arr[i];
	   }
	}
   return second_Smallest;
}
	
static private int secondLargest(int[] arr, int n)
{
	if(n<2)	return -1;
	int largest = Integer.MIN_VALUE;
	int second_Largest = Integer.MIN_VALUE;
	
	for(int i =0; i<arr.length; i++){
            if(arr[i] > largest){
                second_Largest = largest;
                largest = arr[i];
            }
            else if(secLargest > arr[i] && arr[i] != largest){
                second_Largest = arr[i];   
            }
        }
        return second_Largest;
}

public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 7, 7, 5};
	int n = arr.length;
	int sS = secondSmallest(arr, n);
	int sL = secondLargest(arr, n);
	System.out.println("Second smallest is "+sS);
	System.out.println("Second largest is "+sL);
}
}

