class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1,k=n-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(total==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(total<0){
                    j++;
                }else{
                    k--;
                }
            }
            
        }
        ans.addAll(s);
        return ans;
    }
}