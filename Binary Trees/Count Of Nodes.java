// Count Of Nodes
//T.C :- O(N)

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        int totalNodes = leftCount + rightCount + 1;
        return totalNodes;   
    }
}
