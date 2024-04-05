/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res=new ArrayList<>();
        helper(root1,res);
        helper(root2,res);
        Collections.sort(res);
    return res;
    }
    public void helper(TreeNode root,List <Integer>res){
        if(root==null)
            return;
        res.add(root.val);
        helper(root.left,res);
        helper(root.right,res);        
    }
}