// Merge two BST 's

class Solution {
    public void getInorder(TreeNode root, ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        getInorder(root.left, inorder);
        inorder.add(root.val);
        getInorder(root.right, inorder);
    }

    public TreeNode createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }
        int mid = st + (end - st)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = createBST(arr, 0, mid -1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //step1 
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInorder(root1, inorder1 );
        //step2 
        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInorder(root2, inorder2);

        //step3 Merge sorted arr1(i.e:-inorder1) & sorted arr2(i.e:-inorder2)- which gives us a final sorted arr
        int i =0, j =0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i< inorder1.size() && j < inorder2.size()){
            if(inorder1.get(i) <= inorder2.get(j)){
                finalArr.add(inorder1.get(i));
                i++;
            }
            else{
                finalArr.add(inorder2.get(j));
                j++;
            }
        }
        while(i< inorder1.size()){
            finalArr.add(inorder1.get(i));
            i++;
        }
        while(j < inorder2.size()){
            finalArr.add(inorder2.get(j));
            j++;
        }

        //Step4 Convert Sorted Array To Binary Search Tree
        return createBST(finalArr, 0, finalArr.size()-1);
    
    }
}
