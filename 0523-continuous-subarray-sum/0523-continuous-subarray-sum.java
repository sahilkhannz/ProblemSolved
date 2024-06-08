class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<2) return false;
        
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int mod=sum%k;
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