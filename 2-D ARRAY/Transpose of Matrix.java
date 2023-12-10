// Transpose of Matrix

// Approach 1(Brute Force):
//T.C :- O(n^2), Because we are running nested loop.  A.S :- O(n^2), Because we have used an array of size (N*N).
class Solution
{
    public void transpose(int n,int a[][]) {

        int ans[][] = new int[n][n];
        // store the value arr2[i][j]= arr1[i][j]
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                ans[i][j] = a[j][i];
            }
        }
        // and again restore the value to the original array.
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                a[i][j] = ans[i][j];
            }
        }   
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Approach2 :- Now we are doing this using in-palce swaaping in the existing array it will reduce our space from O(n) to O(1).
// T.C :- O(n^2)    A.S :- O(1)
class Solution
{
    public void transpose(int n,int a[][])){
        // Run a nested loop from i=0 to n.
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //swap the arr[i][j] value to arr[j][i] .
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
