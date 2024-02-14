class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        helper(nums,new ArrayList<>());
        return ans;
    }
    public void helper(int []nums,List<Integer> used){
       if(used.size()==nums.length){
           ans.add(new ArrayList(used));
           return;
       }
        for(int i=0;i<nums.length;i++){
            if(used.contains(nums[i]))continue;
            used.add(nums[i]);
            helper(nums,used);
            used.removeLast();
        }
    }
}