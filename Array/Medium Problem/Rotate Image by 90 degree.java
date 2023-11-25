// Rotate Image by 90 degree
// Approach:
// Step 1: Transpose the matrix. (transposing means changing columns to rows and rows to columns)
// Step 2: Reverse each row of the matrix.

// T.C :- O(N*N) + O(N*N).One O(N*N) is for transposing the matrix and the other is for reversing the matrix.
// S.C :- O(1).

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0; i<n; i++){
            for(int j =i; j<matrix[0].length;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 - j];
                matrix[i][matrix.length -1 - j] = temp;
            }  
        }    
    }
}
