class Solution {
    public int numSteps(String s) {
        int op=0,carry=0;
        for(int i=s.length()-1;i>=1;i--){
            if((s.charAt(i)-'0')+carry%2==1){
                op+=2;
                carry=1;
            }else{
                op+=1;
            }
        }
        
        return op+carry;
    }
}