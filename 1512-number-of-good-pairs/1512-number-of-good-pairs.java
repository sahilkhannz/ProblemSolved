class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                ans+=freq.get(nums[i]);
                freq.put(nums[i],freq.get(nums[i])+1);
            }else
                freq.put(nums[i],1);
        }
        return ans;
    }
}