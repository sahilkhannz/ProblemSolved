class Solution {
    public int findMin(int[] nums) {
        // int ans=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]>nums[i])
        //         ans=nums[i];
        // }
        // return ans;
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]<nums[r])
                r=mid;
            else
                l=mid+1;
            
        }
        return nums[l];
    }
}