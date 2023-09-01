// Largest Rectangle in Histogram
// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
// return the area of the largest rectangle in the histogram.

// T.C = O(N) 
// S.C = O(N)

class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
        return 0;
       }
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
}
