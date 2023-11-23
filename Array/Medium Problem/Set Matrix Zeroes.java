// Set Matrix Zeroes

// Approach 2 Better Approach
// T.C :- O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
// Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.
// S.C :- O(N) + O(M),  // Reason: O(N) is for using the row array and O(M) is for using the col array.

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        //Traverse the matrix
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;

                }
            }
        }
        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j]=0; 
                }
            }
        }
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
