// Matrix Diagonal Sum
// Brute Force Approach
// T.C :- O(N2)    

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[0].length; j++){
                if(i==j){
                    sum += mat[i][j];
                }
                else if(i+j == mat.length - 1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Optimized Approach
// T.C :- O(N)       S.C :- O(1)
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i =0; i<mat.length; i++){
            //PD
            sum += mat[i][i];
            //SD
            if(i != mat.length - 1 - i){
                sum += mat[i][mat.length - i -1];
            }
        }
        return sum;
    }
}    
