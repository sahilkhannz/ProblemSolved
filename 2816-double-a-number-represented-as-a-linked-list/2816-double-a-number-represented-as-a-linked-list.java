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
     static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode newHead=reverse(head);
        //pointer to insert node in reverse order
        ListNode temp=null;
        int carry=0;
        while(newHead!=null){
            int sum=(2*newHead.val)+carry;
            if(sum<10){
                ListNode x=new ListNode(sum,temp);
                temp=x;
                carry=0;
            }else{
                ListNode x=new ListNode(sum%10,temp);
                temp=x;
                carry=sum/10;
            }
            newHead=newHead.next;
        }
        if(carry!=0){
           ListNode x=new ListNode(carry,temp);
                temp=x;
                carry=0; 
        }
        return temp;
    }
}