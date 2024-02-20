class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums[i])continue;
            ans=i;
            flag=1;
            break;
        }
        if(flag==0)return nums.length;
        return ans;
    }
}