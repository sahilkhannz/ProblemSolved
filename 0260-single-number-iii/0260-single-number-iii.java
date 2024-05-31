class Solution {
    public int[] singleNumber(int[] nums) {
//         Map<Integer,Integer> freq=new HashMap<>();
        
//         for(int i:nums){
//             freq.put(i,freq.getOrDefault(i,0)+1);
//         }
//         boolean flag=true;
//         int ans[]=new int[2];
//         for(int i:nums){
//             if(freq.get(i)==1){
//                 if(flag){
//                     ans[0]=i;
//                     flag=false;
//                 }else{
//                     ans[1]=i;
//                     break;
//                 }
//             }
            
//         }
//         return ans;
        int xor2no=0;
        for(int i:nums){
            xor2no^=i;
        }
        int result[]=new int[2];
        int lowestBit=xor2no & (-xor2no);
        for(int i:nums){
            if((lowestBit & i) == 0){
                result[0]^=i;
            }else{
                result[1]^=i;
            }
        }
        return result;
    }
}