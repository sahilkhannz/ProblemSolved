class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> hset=new HashSet<>();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            hset.add(nums[i]);
        for(int i=0;i<nums.length;i++){
            
            if(!hset.contains(nums[i]-1)){
                int j=nums[i];
                while(hset.contains(j))
                    j++;
    //The length of the consecutive sequence ending at 100 is 101 - 100 = 1
    //like about we can see why we subtract j from nums[i] earlier we make j=nums[1]
                ans=Math.max(ans,j-nums[i]);
            }
        }
     return ans;   
    }
}