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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count%2==1){
            for(int i=0;i<count/2+1;i++){
                head=head.next;
            }
            return head;
        }
             for(int i=0;i<(count/2);i++){
                head=head.next;
            }
            return head;  
    }
}