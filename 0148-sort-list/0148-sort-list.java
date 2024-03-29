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
    public ListNode sortList(ListNode head) {
    if(head==null || head.next==null)
        return head;
    ListNode slow=head,fast=head,temp=null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
    ListNode l1=sortList(head);
    ListNode l2=sortList(slow);
    
    return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy,ptr1=l1,ptr2=l2;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val<=ptr2.val){
                temp.next=ptr1;
                ptr1=ptr1.next;
            }else{
                temp.next=ptr2;
                ptr2=ptr2.next;
            }
            temp=temp.next;
        }
        if(ptr1!=null){
            temp.next=ptr1;
        }
        if(ptr2!=null){
            temp.next=ptr2;
        }
        return dummy.next;
    }
}