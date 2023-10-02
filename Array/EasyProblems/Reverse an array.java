// Reverse an array
//T.C :- O(N)    S.C :- O(1)
import java.util.*;
public class ArraysDS{
    public static void reverse(int nums[]){
        int first =0, last = nums.length -1;
        while(first < last){
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
            
        }
    }
    public static void main(String args[]){
        int nums[] = {2, 4, 6, 8, 10};
        reverse(nums);
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

//Output :- 10 8 6 4 2 
