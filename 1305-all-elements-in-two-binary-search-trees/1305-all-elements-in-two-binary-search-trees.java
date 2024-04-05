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
        helper1(root1,res);
        helper2(root2,res);
        Collections.sort(res);
    return res;
    }
    public void helper1(TreeNode root,List <Integer>res){
        if(root==null)
            return;
        res.add(root.val);
        helper1(root.left,res);
        helper1(root.right,res);        
    }
    public void helper2(TreeNode root,List <Integer>res){
        if(root==null)
            return;
        res.add(root.val);
        helper2(root.left,res);
        helper2(root.right,res);        
    }
}