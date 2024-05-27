class Solution {
    public int findNumberOfNums(int[] nums, int n, int curNum) {
        int left = 0, right = n - 1;
        int firstIndex = n;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= curNum) {
                firstIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return n - firstIndex;
    }
    
    public int specialArray(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        Arrays.sort(nums);
        
        for(int i=1;i<=n;i++){
            if(i==findNumberOfNums(nums,n,i))
                return i;
        }

    
        return -1;
    }
}