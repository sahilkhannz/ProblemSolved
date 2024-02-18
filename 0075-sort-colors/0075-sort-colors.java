class Solution {
    public void sortColors(int[] nums) {
    int zeroes=0;
    int ones =0;
    int twoes=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0)zeroes++;
        if(nums[i]==1)ones++;
        if(nums[i]==2)twoes++;
    }
    for(int i=0;i<zeroes;i++)
        nums[i]=0;
    for(int i=zeroes;i<zeroes+ones;i++)
        nums[i]=1;
    for(int i=zeroes+ones;i<nums.length;i++)
        nums[i]=2;
        
    }
}