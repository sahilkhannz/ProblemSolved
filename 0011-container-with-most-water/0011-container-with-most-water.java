class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int l=0,r=n-1,max=Integer.MIN_VALUE,result=0;
        while(l<r){
            int minh=Math.min(height[l],height[r]);
            int width=r-l;
            max=Math.max(max,minh*width);
            if(height[l]<height[r])l++;
            else r--;
        }
        return max;
    }
}