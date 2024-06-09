class Solution {
    //modulo ki jay ho
    public int subarraysDivByK(int[] nums, int k) {
        // Initialize count of subarrays, prefix sum, and hash map for remainders
        int count=0,prefix=0;
        Map<Integer,Integer> map=new HashMap<>();
        // To handle subarrays that start from the beginning
        map.put(0,1);
        
        for(int i:nums){
             // Update prefix sum
            prefix+=i;
             // Calculate the remainder of the prefix sum divided by k
            int mod=prefix%k;
            
             // Adjust negative remainders to be positive
            if(mod<0)
                mod+=k;
            
             // If this remainder has been seen before, it means there are subarrays ending here that are divisible by k
            if(map.containsKey(mod)){
                count+=map.get(mod);
                map.put(mod,map.get(mod)+1);
            }else{
                map.put(mod,1);
            }
        }
        return count;
    }
}