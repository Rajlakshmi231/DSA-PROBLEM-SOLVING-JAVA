// Postorder Traversal
//In postorder root comes at last

// T.C :- O(N)
// S.C :- O(N)

// Processing Order In Postorder Traversal (follow these process recursively)
//1) left subtree
//2) right subtree
//3) root


class Solution {
    public void postorder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
}
