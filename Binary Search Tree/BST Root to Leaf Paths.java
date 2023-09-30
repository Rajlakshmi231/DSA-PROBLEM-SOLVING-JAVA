// BST Root to Leaf Paths

// Given the root of a binary tree, return all root-to-leaf paths in any order.
// A leaf is a node with no children.

class Solution {
    public List<String> bstPaths(TreeNode root, String path,List<String> ans ) {
        if(root == null){
            return ans;
        }
        if(root.left == null && root.right == null){
            ans.add(path + root.val);
            return ans;
        }
        bstPaths(root.left, (path + root.val + "->") , ans );
        bstPaths(root.right, (path + root.val + "->") , ans );
        return ans;    
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        bstPaths(root, "", ans );
        return ans;
    }
}
