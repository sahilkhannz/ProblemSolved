class Solution {
    public int numSteps(String s) {
        int op=0,carry=0;
        //if we add 1 in lsb so all bits become 0 till find zero then convert that 0 in 1
        //if we traverse whole string then we append one in front of string
        //odd require 2 number of operations op+=2
        //even require 1 number operation op+=1
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