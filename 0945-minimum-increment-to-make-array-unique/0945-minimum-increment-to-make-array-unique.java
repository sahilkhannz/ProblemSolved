class Solution {
    public int minIncrementForUnique(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                ans+=(nums[i-1]-nums[i]+1);
                nums[i]=nums[i-1]+1;
            }
    
        }
        return ans;
    }
}