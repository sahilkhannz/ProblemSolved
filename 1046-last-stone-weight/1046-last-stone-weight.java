class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            maxHeap.add(stones[i]);
        }
        while(maxHeap.size()>1){
            int y=maxHeap.remove();
            int x=maxHeap.remove();
            if(x!=y)
                maxHeap.add(y-x);
        }
        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.remove();
    }
}