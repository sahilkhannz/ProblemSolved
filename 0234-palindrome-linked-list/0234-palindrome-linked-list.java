/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> copy=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            copy.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<=copy.size()/2;i++){
            if(copy.get(i)==copy.get(copy.size()-1-i))continue;
                return false;
        }
        return true;
    }
}