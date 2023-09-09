// Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

class Solution {
    public int trap(int[] height) {

        if(height==null || height.length<=2)
        return 0;

        int n = height.length;

        // Calculate left max boundary
        int[] maxL = new int[n];
        maxL[0] = height[0];
        for(int i =1; i<n; i++){
            maxL[i] = Math.max(height[i], maxL[i-1]);
        }
        // Calculate right max boundary
        int[] maxR = new int[n];
        maxR[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            maxR[i] = Math.max(height[i], maxR[i+1]);
        }
        int trappedWater =0;
        for(int i =0; i<n; i++){

        //waterlevel
        int waterLevel = Math.min(maxL[i] , maxR[i]);

        // trappedWater
        trappedWater += waterLevel - height[i];

        } 
        return trappedWater;   
    }
}
