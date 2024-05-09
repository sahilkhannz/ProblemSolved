class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Long ans=0L;
        Arrays.sort(happiness);
        ans+=happiness[happiness.length-1];
        int c=1;
        for(int i=happiness.length-2;i>=happiness.length-k;i--){
            ans=ans+Math.max(0,happiness[i]-c);
            c++;
        }
        return ans;
    }
}