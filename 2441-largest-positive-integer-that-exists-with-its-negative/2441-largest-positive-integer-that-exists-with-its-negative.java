class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int temp=-1,ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && map.containsKey(nums[i]*-1)){
                temp = nums[i]*-1;
                
            }
            if(nums[i]>0 && map.containsKey(nums[i]*-1)){
                temp = nums[i];
            }
            if(temp>ans)
                ans=temp;
                
            map.put(nums[i],i);
        }
        return ans;
    }
}