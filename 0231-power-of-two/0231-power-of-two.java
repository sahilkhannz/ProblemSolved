class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        if(n%2==1)return false;
        for(int i=0;i<=n;i++){
            if(1<<i==n)return true;
        }
        return false;
    }
}