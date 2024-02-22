class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int posI=0,negI=1,resI=0,i=0;
        while(i<nums.length){
            if(nums[i]>0){
                res[posI]=nums[i++];           
                posI+=2;
            }else{
                res[negI]=nums[i++];
                negI+=2;
            }
        }
        return res;
    }
}