// Subtree Of Another Tree

// T.C :- O(m*n) n is the total number of nodes in the first binary tree and m is the total number of nodes in the subtree.
// S.C :- O(min(n,m)) depth of recursion tree can go upto n or m, whichever is smaller.

class Solution {
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
    //return true if both are null because it means we reached the leaf node at same time

        if(root == null && subRoot == null){
            return true;
        }
        //return false if we don't reach leaf node at same time and the values are not same 
        else if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }

        //if the value of current node are same then we check for left and right part

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //base case
        if(root == null){
            return false;
        }

        //compare root.val with subroot.val if both data are same then we check for Identical nodes using helper function
        if(root.val == subRoot.val){ 
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        //use 'or' function because if subtree is present in any part, we return true
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);    
    }
}
