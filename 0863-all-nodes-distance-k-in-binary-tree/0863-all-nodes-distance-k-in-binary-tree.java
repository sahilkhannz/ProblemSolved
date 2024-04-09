/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void populateParent(TreeNode root,TreeNode parent,Map parentMap){
        if(root==null)
            return;
        parentMap.put(root,parent);
        populateParent(root.left,root,parentMap);
        populateParent(root.right,root,parentMap);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List <Integer>res=new ArrayList<>();
        if(root ==null)
            return res;
        
        Map <TreeNode,TreeNode> parentMap=new HashMap<>();
        populateParent(root,null,parentMap);
        Map <TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        while(!q.isEmpty() && k>0){
            int size=q.size();
            k--;
            while(size-- !=0){
                TreeNode curr=q.poll();
                
                if(curr.left!=null && visited.containsKey(curr.left)==false){
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right!=null && visited.containsKey(curr.right)==false ){
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                if(parentMap.get(curr)!=null && visited.containsKey(parentMap.get(curr))==false ){
                    q.offer(parentMap.get(curr));
                    visited.put(parentMap.get(curr),true);
                }
            }
        }
        while(!q.isEmpty()){
                res.add(q.poll().val);
            }
     return res;   
    }
}