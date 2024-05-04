class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []ans=new int[nums.length];
        Arrays.fill(ans,1);
        int product=1,n=nums.length;
        for(int i=0;i<n;i++){
            ans[i]*=product;
            product*=nums[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=product;
            product*=nums[i];
        }
    return ans;
    }
}