// Convert Sorted Array to Binary Search Tree

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return creatBST(nums, 0, nums.length - 1);  
    }
   
     private TreeNode creatBST(int[] nums, int st, int end){
        if(st > end){
            return null;
        }
        int mid = st + (end - st)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = creatBST(nums, st, mid - 1);
        root.right =creatBST(nums, mid + 1, end);
        return root;    
    }
}
