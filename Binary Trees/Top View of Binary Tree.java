// Top View of Binary Tree

 class Info{
    Node node ;
    int hd;
    
    public Info(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

class Solution{
  
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root){
      
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        //Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min =0,max=0;
        q.add(new Info(root, 0));
        q.add(null);
        
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                
              if(!map.containsKey(curr.hd)){ //unique hd h to add krenge map m 
                  map.put(curr.hd, curr.node);//key n value pair ko map m add kr diya
              }
              if(curr.node.left != null){
                  q.add(new Info(curr.node.left, curr.hd - 1));
                  min = Math.min(min,curr.hd -1);
              }
              if(curr.node.right != null){
                  q.add(new Info(curr.node.right, curr.hd + 1));
                  max = Math.max(max,curr.hd + 1);
              }    
            }  
        }
        for(int i =min; i<=max; i++ ){
            ans.add(map.get(i).data);
        }
        return ans;
    }
}
