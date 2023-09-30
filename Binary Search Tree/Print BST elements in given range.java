// Print BST elements in given range

class Solution
{   
    public static void printInRange(Node root,int low,int high, ArrayList<Integer>ans){
        if(root == null){
            return ;
        }
        
        if(root.data >= low && root.data <= high){
           printInRange(root.left, low, high, ans);
           ans.add(root.data);
           printInRange(root.right, low, high, ans); 
        }
        
        else if(root.data > low){
          printInRange(root.left, low, high, ans );  
        }
        
        else{
            printInRange(root.right, low, high, ans);
        }  
    }
    
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        printInRange(root, low, high, ans);
        return ans;
    }   
}
