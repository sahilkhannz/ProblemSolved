class Solution {
   
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,nums,new ArrayList<>(),0);
        return ans;
        
    }
    public void helper( List<List<Integer>> ans,int [] nums,List temp,int index){
        ans.add(new ArrayList(temp));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            helper(ans,nums,temp,i+1);
            temp.removeLast();
        }
        
    }
        
        
}
        
 