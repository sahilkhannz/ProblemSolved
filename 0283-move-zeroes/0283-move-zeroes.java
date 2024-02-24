class Solution {
    public void swap(int [] nums,int l, int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void moveZeroes(int[] nums) {
        int zeroes=0,l=0,r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeroes++;
        }
        int idx=0,nonZero=0;
        while(idx<nums.length){
            if(nums[idx]!=0)nums[nonZero++]=nums[idx];
            idx++;
        }
        for(int i=nums.length-zeroes;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}