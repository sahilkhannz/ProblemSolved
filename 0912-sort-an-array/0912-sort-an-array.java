class Solution {
    public int[] sortArray(int[] nums) {
    int ans[]=mergeSort(nums,0,nums.length-1);
    return ans;
    }
    public int[] mergeSort(int []nums,int l,int r){
        if(l==r){
            return new int[]{nums[l]};
        }
        int m=(l+r)/2;
        int arr1[]=mergeSort(nums,l,m);
        int arr2[]=mergeSort(nums,m+1,r);
        return merge(arr1,arr2);
        
    }
    public int[] merge(int[] nums1,int[] nums2) {
     int ans[]=new int[nums1.length+nums2.length];
    int l=0,r=0,k=0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]<nums2[r]){
                ans[k++]=nums1[l++];
            }
            else{
                ans[k++]=nums2[r++];
            }
        }
        while(l<nums1.length){
            ans[k++]=nums1[l++];
        }
        while(r<nums2.length){
            ans[k++]=nums2[r++];
        }
        return ans;
    }
}