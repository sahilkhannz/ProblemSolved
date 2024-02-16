class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int ans[]=new int[m+n];
    int l=0,r=0,k=0;
        while(l<nums1.length-n && r<nums2.length){
            if(nums1[l]<nums2[r]){
                ans[k++]=nums1[l++];
            }
            else{
                ans[k++]=nums2[r++];
            }
        }
        while(l<nums1.length-n){
            ans[k++]=nums1[l++];
        }
        while(r<nums2.length){
            ans[k++]=nums2[r++];
        }
        int in=0;
        for(int i:ans)
            nums1[in++]=i;
    }
}