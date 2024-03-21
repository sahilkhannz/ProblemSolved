class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i]))
                freq.put(nums[i],freq.get(nums[i])+1);
            else
                freq.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(freq.get(nums[i])==1)sum+=nums[i];
        }
    return sum;
    }
}