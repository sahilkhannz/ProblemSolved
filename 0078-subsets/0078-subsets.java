class Solution {
    List <List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,new ArrayList<>(),0);
        return ans;
    }
    public void helper(int []nums,List<Integer> tempList,int start){
        ans.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);
            helper(nums,tempList,i+1);
            tempList.removeLast();
        }
    }
}