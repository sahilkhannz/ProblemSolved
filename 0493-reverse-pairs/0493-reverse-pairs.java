class Solution {
    int reversePair=0;
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return reversePair;
        
    }
    public int[] mergeSort(int[] nums,int l,int r){
        if(l==r){
            return new int[]{nums[l]};
        }
        int mid=(l+r)/2;
        int[] nums1=mergeSort(nums,l,mid);
        int[] nums2=mergeSort(nums,mid+1,r);
        
        counter(nums1,nums2);
        
        return merge(nums1,nums2);
    }
    public void counter(int []nums1,int []nums2){
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>2*(long)nums2[j]){
                reversePair+=nums1.length-i;
                j++;
            }
            else
                i++;
        }
    }
    
    public int[] merge(int nums1[],int nums2[]){
        int ans[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
                
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[k++]=nums2[j++];
        }
        return ans;
    }
    
}