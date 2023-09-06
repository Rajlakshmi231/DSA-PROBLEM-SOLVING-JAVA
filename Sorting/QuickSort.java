// Quick Sort Algorithm
public class Solution {
	
	public static void quickSort(int[] input,int startIndex, int endInedx) {
    
		 if(startIndex >= endInedx ){
			 return;
		 }
		 int pIdx = partition(input, startIndex,endInedx);
		 quickSort(input,startIndex,pIdx -1); //left
		 quickSort(input,pIdx + 1, endInedx);	//right
	}
	public static int partition(int[] input,int startIndex, int endInedx) {
		int pivot = input[endInedx];
		int i = startIndex-1;
		
		for(int j = startIndex; j < endInedx; j++ ){
			if(input[j] <= pivot){
				i++;
				//swap
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
				
			}	
		} 
		i++;
    //swap
		int temp = pivot;
		input[endInedx] = input[i];
		input[i] = temp;
		return i;				  		
	}
}
