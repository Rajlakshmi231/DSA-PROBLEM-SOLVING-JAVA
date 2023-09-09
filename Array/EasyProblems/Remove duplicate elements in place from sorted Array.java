// Remove duplicate elements in place from sorted Array
// T.C = O(N)   S.C = O(N)

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int i =0;
        for(int j =1; j<N; j++){
            if(A[i] != A[j]){
                i++;
                A[i] = A[j];
            }
        }
        return i + 1; //size of arr of unique elemnts
    }
}
