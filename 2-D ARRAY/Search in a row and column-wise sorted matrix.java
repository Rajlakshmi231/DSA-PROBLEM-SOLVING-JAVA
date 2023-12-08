// Search in a row and column-wise sorted matrix

// StairCase Search Approach
// T.C :- O(N+M), where N = given row number, M = given column number.
// S.C :- O(1)

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
