class Solution {
    int ans=0;
    public int findKthLargest(int[] nums, int k) {
       //quick(nums,0,nums.length,k);
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k)
                minHeap.remove();
        }
        return minHeap.peek();
    }/*
    public void quick(int []nums,int s,int e,int k){
        if(s>=e)return;
        index=partition(s,e);
        if(nums.length-k==index){
            ans=nums[index];
            return;
        }
        quick(nums,s,index-1);
        quick(nums,index+1,r);    
    }
    public int partition(int []nums,int low,int high){
        int pivot=num[high];
        int i=low-1;
        for(int j=low;j<nums.length;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums[i],nums[j]);
            }
        }
        swap(nums[i+1],nums[high]);
        return i+1;
        
    }
*/}