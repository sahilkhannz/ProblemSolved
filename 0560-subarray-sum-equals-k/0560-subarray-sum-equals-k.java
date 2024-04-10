class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store number of subarrays
        // starting from index zero having
        // particular value of sum.
        Map<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,1);
        int currsum=0,ans=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
             //calculate the sum that have to be removed
          //so that we can get the desired sum
            int removesum=currsum-k;
            
            //get count of occurrences of that sum that
          //have to removed and add it to res value
            if(hmap.containsKey(removesum)){
                ans+=hmap.get(removesum);
            }
             // Add currsum value to count of
            // different values of sum.
            hmap.put(currsum,hmap.getOrDefault(currsum,0)+1);
                      
                        
        }
        return ans;
    }
}