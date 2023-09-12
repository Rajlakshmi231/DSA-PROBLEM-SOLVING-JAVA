// Maximal Rectangle
// Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea =0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // Next smaller to right
        Stack<Integer> s = new Stack<>();
        for(int i =heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next smaller to left
        s = new Stack<>();
        for(int j = 0; j<heights.length; j++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[j]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[j] = -1;
            }
            else{
                nsl[j] = s.peek();
            }
            s.push(j);
        }

        // Calculate Current Area: Area*width*height (width = j-i-1 ,i.e. nsr[i] - nsl[j] - 1 )
        for(int k =0; k <heights.length; k++){
            int height = heights[k];
            int width = nsr[k] - nsl[k] - 1;
            int area = height * width;
            maxArea = Math.max(area, maxArea); 
        }
        return maxArea;
    }
    
    public int maximalRectangle(char[][] matrix) {
        int maximal = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int currRow[] = new int[n]; //for storing the current row we are trasversing

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1'){
                    currRow[j] +=1; 
                }
                else{
                    currRow[j] = 0;
                }
            }
            maximal = Math.max(maximal, largestRectangleArea(currRow));
        }
        return maximal;       
    }  
}
