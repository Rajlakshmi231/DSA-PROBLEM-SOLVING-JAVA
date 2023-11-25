// Rotate Image by 90 degree

// Approach 1 (Brute Force)
// T.C :- O(n^2), where n is the size of the matrix.
// S.C :- O(n^2)

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
               rotated[j][n-i-1] = matrix[i][j]; 
            }
        }
        for (int i = 0; i < n; i++) {
            System.arraycopy(rotated[i], 0, matrix[i], 0, n);
        }  
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Approach 2 (Optimal Approach):
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
