class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,ans,new ArrayList<>(),target,0,target);
        
        return ans;
    }
    public void solve(int []arr,List<List<Integer>> ans,ArrayList<Integer> temp, int target,int idx,int sum){
        int n=arr.length;
        // if(idx==n || sum==target){
        //     ans.add(new ArrayList<>(temp));
        //     return ;
        // }
        // if(arr[idx]<=target-sum){
        //     temp.add(arr[idx]);
        //     //pick
        //     solve(arr,ans,temp,target,idx,sum+arr[idx]);
        //     temp.removeLast();
        // }
        // //not pick
        // solve(arr,ans,temp,target,idx+1,sum);
        if(sum<0)
            return;
        else if(sum==0){
            ans.add(new ArrayList<>(temp));
        }else{
            for(int i=idx;i<n;i++){
                temp.add(arr[i]);//add
                solve(arr,ans,temp,target,i,sum-arr[i]);//explore
                //i remain same because we can use multiple times
                temp.removeLast();
            }
        }
        
    }
}