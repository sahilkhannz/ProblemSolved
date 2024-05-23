class Solution {
    public void backtrack(int []nums,List<List<Integer>> ans,List<Integer> temp,int start){
//         ans.add(new ArrayList<>(temp));
        
//         for(int i=start;i<nums.length;i++){
//             // including element
//             temp.add(nums[i]);
            
//             backtrack(nums,ans,temp,i+1);
            
//             //exclude element
//             temp.removeLast();      
            
//         }
        if(start>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
         temp.add(nums[start]);
         backtrack(nums,ans,temp,start+1);
         temp.removeLast();
         backtrack(nums,ans,temp,start+1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        
        backtrack(nums,ans,new ArrayList<>(),0);
        
        return ans;
    }
}