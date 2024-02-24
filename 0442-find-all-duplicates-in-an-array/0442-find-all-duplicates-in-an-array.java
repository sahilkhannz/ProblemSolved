class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set <Integer>temp=new HashSet<>();
        List <Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(temp.add(nums[i]))continue;
            ans.add(nums[i]);
        }
        return ans;
    }
}