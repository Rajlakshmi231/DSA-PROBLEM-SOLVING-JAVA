// Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Binary Search Approach
// T.C :- O(log(NxM))
// S.C :- O(1)     
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =matrix.length, col = matrix[0].length;
        int start = 0 ; 
        int end = row*col - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int element = matrix[mid/col][mid%col];
            if(element == target){
                return true;
            }
            else if(target > element){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}    
