class Solution {
    public int countTriplets(int[] arr) {
        int ans=0,n=arr.length;
        
        for(int i=0;i<n;i++){
            int xor=arr[i];
            for(int k=i+1;k<n;k++){
                xor^=arr[k];
                if(xor==0)
                    ans+=(k-i);
            }
        }
        
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int a=0;
//                 for(int k=i;k<j;k++){
//                     a^=arr[k];
//                 }
//                 int b=0;
//                 for(int k=j;k<n;k++){
//                     b^=arr[k];
//                     if(a==b)
//                         ans++;
//                 }
//             }
//         }
        return ans;
    }
}