class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)
            return nums;
        int ri=0,n=nums.length;
        int r[]=new int[n-k+1];
        
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            // remove out of k range
            if(!dq.isEmpty() && dq.peek()==i-k)
                dq.poll();
            //remove smaller element from back
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
                dq.removeLast();
            dq.offer(i);
            if(i>=k-1)
                r[ri++]=nums[dq.peek()];
        }
        return r;
       
    
    }
}