class Solution {
    public boolean canJump(int[] nums) {
        boolean flag=true;
        int n=nums.length,reachable=n-1;
        for(int i=n-1;i>=0;i--){
            if((nums[i]+i)>=reachable){
                flag=true;
                reachable=i;
            }else
                flag=false;
        }
        return flag;
    }
}