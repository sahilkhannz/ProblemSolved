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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List <Integer>levelNode=new ArrayList<>();
            while(size-- != 0){
                TreeNode curr=q.poll();
                if(curr.right!=null)
                    q.offer(curr.right);
                if(curr.left!=null)
                    q.offer(curr.left);
                levelNode.add(curr.val);
            }
            res.add(levelNode.get(0));
        }
        return res;
    }
}