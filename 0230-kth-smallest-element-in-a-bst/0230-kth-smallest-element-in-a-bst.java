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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;
        List <Integer>temp=new ArrayList<>();
        treeToList(root,temp);
        if(k>0 && k<=temp.size())
            return temp.get(k-1);
        return -1;
    }
    public void treeToList(TreeNode root,List<Integer> temp){
        if(root==null)
            return;
        treeToList(root.left,temp);
        temp.add(root.val);
        treeToList(root.right,temp);
    }
}