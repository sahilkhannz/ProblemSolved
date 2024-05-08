class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        PriorityQueue<Pair<Integer,Integer>> maxHeap=new PriorityQueue<>(
        (a,b) -> b.getValue() - a.getValue()
        );
        
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer i:freq.keySet()){
            maxHeap.add(new Pair<>(i,freq.get(i)));
        }
        
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
            ans[i]=maxHeap.poll().getKey();
        return ans;
    }
}