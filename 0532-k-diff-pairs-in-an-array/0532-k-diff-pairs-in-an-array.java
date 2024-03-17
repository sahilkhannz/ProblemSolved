class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int l=0,prev=Integer.MAX_VALUE;
        for(int r=1;r<nums.length;r++){
            while(l<r && nums[r]-nums[l]>k)l++;
            
            if(l!=r && prev!=nums[l] && nums[r]-nums[l]==k){
                count++;
                prev=nums[l];
            }
        }
        return count;
    }
}