class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length,reachable=n-1;
        for(int i=n-1;i>=0;i--){
            if((nums[i]+i)>=reachable)
                reachable=i;
        }
        if(reachable==0)
            return true;
        return false;
    }
}