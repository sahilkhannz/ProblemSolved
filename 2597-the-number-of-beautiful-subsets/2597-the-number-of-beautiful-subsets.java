class Solution {
    int res;
    public int beautifulSubsets(int[] nums, int k) {
        res=0;
        Map<Integer,Integer> map=new HashMap<>();
        backtrack(nums,0,map,k);
        return res-1;
    }
    public void backtrack(int []nums,int idx,Map<Integer,Integer> map,int k){
        if(idx==nums.length){
            res++;
            return;
        }
        
        //take
        if(!map.containsKey(nums[idx]+k) && !map.containsKey(nums[idx]-k)){
            map.put(nums[idx],map.getOrDefault(nums[idx],0)+1);//do
            
            backtrack(nums,idx+1,map,k);// explore
            
            map.put(nums[idx],map.get(nums[idx])-1);//undo
            
            if(map.get(nums[idx])==0)
                map.remove(nums[idx]);
        }
        
        //not take
        backtrack(nums,idx+1,map,k);// explore without including num[idx]
    }
}