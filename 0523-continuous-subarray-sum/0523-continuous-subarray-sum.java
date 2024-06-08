class Solution {
    //modulo ki jay ho
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<2) return false;
        //we store mod of all of sum of array
        //if we do mod of sum of array if we get 2 times same mod that means
        //it's multiple of k
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int mod=sum%k;
            //check we seen it before?
            if(map.containsKey(mod)){
                int l=i-map.get(mod);
                if(l>=2)
                    return true;
            }else
                map.put(mod,i);
        }
        
    return false;
    }
}