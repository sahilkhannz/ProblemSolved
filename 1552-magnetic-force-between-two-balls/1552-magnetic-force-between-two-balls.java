class Solution {
    public boolean isPosition(int []nums,int k,int minMag){
        int lastPosition=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-lastPosition>= minMag){
                count++;
                lastPosition=nums[i];
            }
            if(count>=k) return true;
        }
        return false;
    }
    public int maxDistance(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=1;
        int l=1,r=nums[nums.length-1]-nums[0];
        while(l<=r){
            int m=l+(r-l)/2;
            if(isPosition(nums,k,m)){
                l=m+1;
                ans=m;
            }
            else
                r=m-1;
        }
        return ans;
    }
}